package kz.kaznu.islam.L1;

public class ManyThreads {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        double[] array = new double[100_000_000];

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });



        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(System.currentTimeMillis() - time);
    }
}
