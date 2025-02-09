package kz.kaznu.islam.L1;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первый метод");
        System.out.println("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows + 1][cols];
        System.out.println("Введите элементы массива построчно:");
        for (int i = 1; i < rows + 1; i++) {
            System.out.println(i + " строка: ");
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Сумма положительных элементов равна: ");
        System.out.println(sumOfPositiveElements(array));


        System.out.println("Второй метод");
        System.out.println("Введите сторону квадрата: ");
        int a = scanner.nextInt();
        char[][] square = new char[a][a];
        print2DArray(square, '*');


        System.out.println("Третий метод");
        System.out.println("Элемент заполнения массива (не ноль): ");
        int b = scanner.nextInt();
        System.out.println("Размер квадратного массива: ");
        int size = scanner.nextInt();
        int[][] diagonalArray = new int[size][size];
        nullDiagonal(diagonalArray, b, size);
        print2DArrayInt(diagonalArray);


        System.out.println("Четвертый метод");
        System.out.println(findMax(array));


        System.out.println("Пятый метод");
        System.out.println(sumOfRowOrColumn(array));
    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void print2DArray(char[][] arr, char initialValue) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = initialValue;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void print2DArrayInt(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void nullDiagonal(int[][] arr, int b, int size) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = b;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][size - 1 - i] = 0;
        }
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int sumOfRowOrColumn(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если нужно посчитать сумму строки, введите 1. Если столбца, 0:  ");
        int sum = 0;
        int a = scanner.nextInt();
        if (a == 1) {
            for (int j = 0; j < arr[1].length; j++) {
                sum += arr[1][j];
            }
        }
        if (a == 0) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][1];
            }
        }
        return sum;
    }
}


