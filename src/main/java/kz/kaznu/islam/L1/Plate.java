package kz.kaznu.islam.L1;

public class Plate {
    private int volume;
    private int food;

    public Plate(int volume) {
        this.volume = volume;
        this.food = volume;
    }

    public void addFood(int amount) {
        food += amount;
        if (food > volume) {
            food = volume;
        }
    }

    public boolean decreaseFood(int amount) {
        if (food >= 0) {
            food -= amount;
            return true;
        }
        return false;
    }

    public int getFood() {
        return food;
    }
}
