package testStudy.Thread.CyclicBarrierAndCountDownLatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CWorker implements Runnable{
    CyclicBarrier cyclicBarrier;

    public CWorker(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("I am go to buy Beer");
        try {
            Thread.sleep(15000);
            System.out.println("I am Back and I am get Beer ");
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
