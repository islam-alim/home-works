package kz.kaznu.islam.L1;

public class Animal {
    String name;
    int speed;
    public int endurance;

    public Animal(String name, int speed, int endurance) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
    }

    public void run(int distance) {
        int endurance = this.endurance;
        int time = distance / speed;
        endurance -= 1;
        this.endurance = endurance;
        if (endurance <= 0) {
            System.out.println(name + " is tired");
            time = -1;
            System.out.println(time);
        } else {
            System.out.println(time);
        }
    }

        public void swim(int distance) {
            int endurance = this.endurance;
            int time = distance / speed;
            endurance -= 2;
            if (endurance <= 0) {
                System.out.println(name + " is tired");
                time = -1;
                System.out.println(time);
            } else {
                System.out.println(time);
            }
        }

    public void info() {
        if (endurance >= 0) {
            System.out.println(name + " " + speed + " " + endurance);
        }
    }
}

