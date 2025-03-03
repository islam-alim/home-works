package kz.kaznu.islam.L1;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate plate) {
        if (!isFull && plate.decreaseFood(appetite)) {
            isFull = true;
        }
    }

    public void info() {
        System.out.println(name + " сыт: " + isFull);
    }
}
