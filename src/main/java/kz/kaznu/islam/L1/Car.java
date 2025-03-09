package kz.kaznu.islam.L1;

public class Car implements Vehicle {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }


    public String getName() {
        return "Машина";
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void decreaseFuel(int amount) {
        fuel -= amount;
    }


    @Override
    public boolean move(int dist, Way way) {
        if (way == Way.БОЛОТО || way == Way.ЛЕС) {
            System.out.println(getName() + " не может двигаться по " + way);
            return false;
        }
        decreaseFuel(5);
        System.out.println(getName() + " проехала " + dist + " км. Осталось бензина: " + fuel);
        return true;
    }
}
