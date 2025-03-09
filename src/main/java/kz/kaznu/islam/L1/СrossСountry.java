package kz.kaznu.islam.L1;

public class СrossСountry implements Vehicle {
    private int fuel;

    public СrossСountry(int fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return "Вездеход";
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean move(int dist, Way way) {
        if (fuel < dist) {
            System.out.println("Недостаточно бензина");
            return false;
        }
        decreaseFuel(6);
        System.out.println(getName() + " проехал " + dist + " км. Осталось бензина: " + fuel);
        return true;
    }

    @Override
    public void decreaseFuel(int amount) {
        fuel -= amount;
    }
}
