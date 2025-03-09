package kz.kaznu.islam.L1;

public class Human {
    private String name;
    private Vehicle currentTransport;

    public Human(String name) {
        this.name = name;
    }


    public void sit(Vehicle transport) {
        System.out.println(name + " сел на " + transport.getName());
        this.currentTransport = transport;

    }

    public void stand() {
        if (currentTransport != null) {
            this.currentTransport = null;
            System.out.println(name + " слез с транспорта");
        } else {
            System.out.println(name + " не использует транспорт");
        }
    }

    public boolean move(int dist, Way way) {
        if (currentTransport != null) {
            return currentTransport.move(dist, way);
        } else {
            System.out.println(name + " идёт пешком " + dist + " км по местности: " + way);
            return true;
        }
    }
}
