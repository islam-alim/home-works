package kz.kaznu.islam.L1.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // считали от пользователя какой то текст
//        String userInput = scanner.nextLine();
//        byte[] bytes = userInput.getBytes(); // преобразовали в массив байтов

        try (Socket socket = new Socket("localhost", 8088)) { // подключились к серверу
            PingClient pingClient = new PingClient(socket.getInputStream(), socket.getOutputStream());// получем входной поток от сервера и поток через который мы можем отправлять (пока что можем только передавать)

            System.out.println("Enter an operation: ");
            String operation = scanner.nextLine();
            pingClient.sendLine(operation);

            System.out.println("Enter the first number: ");
            String num1 = scanner.nextLine();
            pingClient.sendLine(num1);

            System.out.println("Enter the second number: ");
            String num2 = scanner.nextLine();
            pingClient.sendLine(num2);

            String response = pingClient.readResponse();
            System.out.println("Answer from a server: " + response);


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
