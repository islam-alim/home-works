package kz.kaznu.islam.L1;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Mark", "Zuck", "Vasilyevich", 1990, "mark@gmaill.com"),
                new User("Petr", "Pater", "Yuriyevich", 1965, "petyapavlov@mail.ru"),
                new User("Ludwig", "Boltzmann", "Eduard", 2000, "ludwig@gmail.com"),
                new User("Albert", "Einstein", "-", 1999, "albert@gmaill.com"),
                new User("Robert", "Koch", "-", 1965, "robert@mail.ru"),
                new User("Robert", "De", "Niro", 1844, "deniro@gmail.com"),
                new User("Ariana", "Grande", "-", 1844, "ag@gmail.com"),
                new User("Bill", "Whiters", "Junior", 1844, "bill@gmail.com"),
                new User("Martin", "Luther", "King", 1844, "king@gmail.com"),
                new User("Mary", "Teresa", "Bojaxhiu", 1910, "teresaludwig@gmail.com")
        };

        int current_year = 2025;
        for (int i = 0; i < users.length; i++) {
            if (current_year - users[i].year_of_birth > 40) {
                users[i].printUser();
                System.out.println();
            }
        }


        Box box1 = new Box("red", "open");
        box1.info();
        box1.setState("closed");
        box1.info();
        box1.setState("open");
        box1.setColor("green");
        box1.info();
        box1.putInItem("meet");
        box1.info();
        box1.putOutItem();
        box1.info();


    }
}
