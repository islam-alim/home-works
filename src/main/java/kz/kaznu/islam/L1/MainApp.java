package kz.kaznu.islam.L1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        // вывод файлов в корне
        File root = new File(".");
        File[] files = root.listFiles();
        System.out.println("Текстовые файлы в корне проекта:");
        if (files != null && files.length > 0) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Файлы не найдены.");
        }


        // поиск определенного файла
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);


        // чтение существующего файла
        if (file.exists()) {
            FileInputStream int1 = new FileInputStream(file);
            BufferedInputStream in2 = new BufferedInputStream(int1);
            try (InputStreamReader in = new InputStreamReader(in2)) {
                int n = in.read();
                while (n != -1) {
                    System.out.println((char) n);
                    n = in.read();
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файл не найден");
        }

        // ввод строки для записи
        System.out.println("Введите строку для записи в файл:");


        // запись строки в файл
        String data = scanner.nextLine();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file, true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
            out.flush(); // все оставшиеся данные в буфере запиши в файл
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
