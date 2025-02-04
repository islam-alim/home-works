package kz.kaznu.islam.L1;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    static int[] array = new int[10]; // массив для 3го метода
    static int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        stringPrint(a, input);

        sumElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        arrayFilling(5, array);
        arrayChange(5, arr);
        compareHalfs(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20});
    }
    public static void stringPrint(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }
    public static void sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 5) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void arrayFilling(int a, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void arrayChange(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void compareHalfs(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 ++;
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 ++;
        }
        if (sum1 > sum2) {
            System.out.println("First half is bigger");
        } else {
            System.out.println("Second half is bigger");
        }
    }
}
