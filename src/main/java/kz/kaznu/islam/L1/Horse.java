package kz.kaznu.islam.L1;

public class Horse extends Animal {
    public Horse(String name, int speed, int endurance) {
        super(name, speed, endurance);
    }

    public void swim(int distance) {
        int time = distance / speed;
        endurance -= 4;
        if (endurance <= 0) {
            System.out.println(name + " is tired");
            time = -1;
            System.out.println(time);
        } else {
            System.out.println(time);
        }
    }
}
