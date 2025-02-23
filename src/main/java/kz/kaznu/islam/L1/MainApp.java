package kz.kaznu.islam.L1;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 4, 4);
        Dog dog = new Dog("Sharik", 5, 5);
        Horse horse = new Horse("Tulpar", 10, 15);

        cat.info();
        cat.run(10);
        cat.info();
        cat.swim(10);
        cat.info();

        dog.info();
        dog.run(10);
        dog.info();
        dog.swim(10);
        dog.info();

        horse.info();
        horse.run(10);
        horse.info();
        horse.swim(20);
        horse.info();
        horse.run(10);
        horse.info();
        horse.swim(10);
        horse.swim(18);
        horse.swim(10);
        horse.info();

    }
}
