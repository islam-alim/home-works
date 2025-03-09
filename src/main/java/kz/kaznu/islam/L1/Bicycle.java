package kz.kaznu.islam.L1;

public class Bicycle implements Vehicle {

    public String getName() {
        return "Велосипед";
    }

    @Override
    public void decreaseFuel(int amount) {
        System.out.println("Велосипед не тратит топливо");
    }

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public boolean move(int dist, Way way) {
        if (way == Way.БОЛОТО) {
            System.out.println(getName() + " не может двигаться по " + way);
            return false;
        }
        System.out.println(getName() + " проехал " + dist + " км.");
        return true;
    }
}
