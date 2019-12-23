package testStudy.Thread.CyclicBarrierAndCountDownLatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BWorker implements Runnable {
    final int id;
    final CyclicBarrier barrier;

    public BWorker(int id, CyclicBarrier barrier) {
        this.id = id;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.id + "starts to run !");
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println(this.id + "arrived !");
            this.barrier.await();
            System.out.println(this.id + "arrived !test");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
