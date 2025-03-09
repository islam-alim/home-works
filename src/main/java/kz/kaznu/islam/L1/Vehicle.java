package kz.kaznu.islam.L1;

public interface Vehicle {
    boolean move(int dist, Way way);
    String getName();
    int getFuel();
    void decreaseFuel(int amount);
}
