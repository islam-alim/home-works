package kz.kaznu.islam.HW1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5: ");
        int a = number.nextInt();
        if (a == 1) {
            greetings();
        }
        if (a == 2) {
            checkSign();
        }
        if (a == 3) {
            selectColor();
        }
        if (a == 4) {
            compareNumbers();
        }
        if (a == 5) {
            addOrSubtractAndPrint(2, 3, true);
        }
    }

    public static void greetings(){
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 3;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (10 < data && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 2;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            int result = initValue + delta;
            System.out.println(result);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }
    }
}
