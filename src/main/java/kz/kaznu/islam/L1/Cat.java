package kz.kaznu.islam.L1;

public class Cat extends Animal {

    public Cat(String name, int speed, int endurance) {
        super(name, speed, endurance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat cannot swim");
    }
}
