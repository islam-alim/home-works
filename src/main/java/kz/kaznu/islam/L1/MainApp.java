package kz.kaznu.islam.L1;

import java.util.ArrayList;
import java.util.Arrays;

import static kz.kaznu.islam.L1.Employee.*;


public class MainApp {

    public static void main(String[] args) {
        printNumbers(2, 9);
        sumNumbers(1, 2, 3, 4, 5, 6, 10);
        changeElements(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        increaseElements(5,2, 3, 4, 5, 6, 7);



        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Islam", 25));
        employees.add(new Employee("Maria", 30));
        employees.add(new Employee("Wolfgang", 22));
        employees.add(new Employee("Hannah", 28));

        getEmployeeNames(employees);
        filterByAge(employees, 25);
        isAverageAgeAbove(employees, 26);
        getYoungestEmployee(employees);

    }


    public static void printNumbers(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < max - 1; i++) {
            list.add(min + i);

        }
        System.out.println(list);
    }

    public static void sumNumbers(Integer... numbers) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            if (a > 5) {
                total += a;
            }
        }
        System.out.println(list);
        System.out.println(total);
    }

    public static void changeElements(int a, Integer... numbers) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        for (int i = 0; i < list.size(); i++) {
            list.set(i, a);
        }
        System.out.println(list);
    }

    public static void increaseElements(int a, Integer... numbers) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + a);
        }
        System.out.println(list);
    }
}
