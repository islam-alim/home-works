package kz.kaznu.islam.L1;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(30);
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 15),
                new Cat("Рыжик", 12)
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
            plate.addFood(10);
            cat.eat(plate);
            cat.info();
            cat.eat(plate);
        }
        System.out.println("Остаток еды в тарелке: " + plate.getFood());
    }
}
