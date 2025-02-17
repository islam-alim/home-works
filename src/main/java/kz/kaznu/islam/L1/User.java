package kz.kaznu.islam.L1;

public class User {
    String name;
    String surname;
    String patronymic;
    public int year_of_birth;
    String email;

    public User(String name, String surname, String patronymic, int year_of_birth, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.year_of_birth = year_of_birth;
        this.email = email;
    }

    public void printUser() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + year_of_birth);
        System.out.println("email: " + email);
    }
}
