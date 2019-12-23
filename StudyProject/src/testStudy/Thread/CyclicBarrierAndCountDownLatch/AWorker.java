package testStudy.Thread.CyclicBarrierAndCountDownLatch;

import java.util.concurrent.CountDownLatch;

public class AWorker implements Runnable {
    final CountDownLatch begin;
    final CountDownLatch end;
    final int id;

    public AWorker(CountDownLatch begin, CountDownLatch end, int id) {
        this.begin = begin;
        this.end = end;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.id + " ready !");
            begin.await();
            // run...
            Thread.sleep((long) (Math.random() * 10000));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(this.id + " arrived !");
            end.countDown();
        }
    }
}
