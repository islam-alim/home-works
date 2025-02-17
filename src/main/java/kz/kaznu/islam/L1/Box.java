package kz.kaznu.islam.L1;

import java.util.Scanner;

public class Box {
    Scanner scanner = new Scanner(System.in);
    private float size = 4.5f;
    String color;
    String state = "closed";
    String item;

    public Box(String color, String state) {
        this.color = color;
        this.state = state;

    }

    public void setState(String state) {
        this.state = state; // setter
    }

    public void setColor(String color) {
        this.color = color; // setter
    }

    public void info() {
        System.out.println(size + " " + color + " " + state + " " + item);
    }

    public void putInItem(String item) {
        if (state == "open") {
            this.item = item;
        }
    }

    public void putOutItem() {
        if (state == "open") {
            item = "null";
        }
    }
}
