package kz.kaznu.islam.L1;

public class MainApp {
    public static void main(String[] args) {
        Human human = new Human("Человек");
        Vehicle car = new Car(50);
        Vehicle horse = new Horse(30);
        Vehicle bicycle = new Bicycle();
        Vehicle crossCountry = new СrossСountry(70);



        human.sit(car);
        System.out.println(car.getFuel());
        human.move(20, Way.РАВНИНА);
        human.move(10, Way.БОЛОТО);

        human.stand();

        human.move(5, Way.ЛЕС);

        human.sit(horse);
        System.out.println(horse.getFuel());
        human.move(15, Way.РАВНИНА);
        human.move(5, Way.БОЛОТО);
        human.move(10, Way.ЛЕС);
        human.stand();

        human.sit(bicycle);
        System.out.println(bicycle.getFuel());
        human.move(15, Way.РАВНИНА);
        human.move(5, Way.БОЛОТО);
        human.move(10, Way.ЛЕС);
        human.stand();

        human.sit(crossCountry);
        System.out.println(crossCountry.getFuel());
        human.move(15, Way.РАВНИНА);
        human.move(5, Way.БОЛОТО);
        human.move(10, Way.ЛЕС);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.move(5, Way.БОЛОТО);
        human.stand();
    }
}
