package kz.kaznu.islam.L1.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.String.valueOf;

public class PingServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            readRequest(socket);
        }
    }

    // текст считываем и выводим в консоль из потока ввода
    private static void readRequest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while (true) {
            String operation = reader.readLine();
            String num1 = reader.readLine();
            String num2 = reader.readLine();
            String response;

            try {
                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);

                if (operation.equals("+")) {
                    response = String.valueOf(a + b);
                } else if (operation.equals("-")) {
                    response = String.valueOf(a - b);
                } else if (operation.equals("*")) {
                    response = String.valueOf(a * b);
                } else if (operation.equals("/")) {
                    response = String.valueOf(a / b);
                } else {
                    response = "Incorrect operation";
                }
            } catch (NumberFormatException e) {
                response = "Incorrect number";
            }
            writer.write(response);
            writer.newLine();
            writer.flush();

            reader.close();
            writer.close();
            socket.close();
        }

    }

}

