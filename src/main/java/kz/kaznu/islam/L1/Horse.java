package kz.kaznu.islam.L1;

public class Horse implements Vehicle {
    private int endurance;

    public Horse(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public String getName() {
        return "Лошадь";
    }

    @Override
    public int getFuel() {
        return endurance;
    }

    @Override
    public void decreaseFuel(int amount) {
        endurance -= amount;
    }

    @Override
    public boolean move(int dist, Way way) {
        if (way == Way.БОЛОТО) {
            System.out.println(getName() + " не может двигаться по " + way);
            return false;
        }
        if (endurance < dist) {
            System.out.println("Лошади не хватает сил");
            return false;
        }
        decreaseFuel(10);
        System.out.println(getName() + " пробежала " + dist + " км. Осталось сил: " + endurance);
        return true;
    }


}
