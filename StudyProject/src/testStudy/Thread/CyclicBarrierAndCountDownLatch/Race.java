package testStudy.Thread.CyclicBarrierAndCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Race {
    public static void main(String[] args) {
        final int num = 5;
        final CountDownLatch begin = new CountDownLatch(1);
        final CountDownLatch end = new CountDownLatch(num);

        for (int i = 0; i < num; i++) {
            Thread thread = new Thread(new AWorker(begin,end,i));
            thread.start();
        }

        // judge prepare...
        try {
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("judge say : run !");
        begin.countDown();
        long startTime = System.currentTimeMillis();

        try {
            end.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            long endTime = System.currentTimeMillis();
            System.out.println("judge say : all arrived !");
            System.out.println("spend time: " + (endTime - startTime));
        }
    }
}
