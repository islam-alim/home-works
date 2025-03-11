package kz.kaznu.islam.L1;
import java.util.ArrayList;

public class Employee {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static ArrayList<String> getEmployeeNames(ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static ArrayList<Employee> filterByAge(ArrayList<Employee> employees, int min_age) {
        ArrayList<Employee> filtered = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getAge() >= min_age) {
                filtered.add(e);
            }
        }
        return filtered;
    }

    public static boolean isAverageAgeAbove(ArrayList<Employee> employees, int min_average_age) {
        int total_age = 0;
        for (Employee employee : employees) {
            total_age += employee.getAge();
        }
        int average_age = total_age / employees.size();
        return average_age > min_average_age;
    }

    public static void getYoungestEmployee(ArrayList<Employee> employees) {
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        System.out.println(youngest.getName());
    }
}
