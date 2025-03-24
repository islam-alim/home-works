package kz.kaznu.islam.L1;

public class OneThread {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                double[] array = new double[100_000_000];
                for (int i = 0; i < array.length; i++) {
                    array[i] = 1.14 * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        t.start();

        System.out.println(System.currentTimeMillis() - time);
    }
}
