package kz.kaznu.islam.L1.client;

import java.io.*;

public class PingClient implements AutoCloseable {
    private BufferedReader in; // для передачи бинарных данных

    private BufferedWriter out;

    public PingClient(InputStream in, OutputStream out) {
        this.in = new BufferedReader(new InputStreamReader(in));
        this.out = new BufferedWriter(new OutputStreamWriter(out));
    }

    public void sendLine(String line) throws IOException {
        out.write(line);
        out.newLine();
        out.flush();
    }

    public String readResponse() throws IOException {
        return in.readLine();
    }

    @Override
    public void close() throws Exception {
        in.close();
        out.close();
    }
}
