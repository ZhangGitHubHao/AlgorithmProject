package testStudy.Thread.CyclicBarrierAndCountDownLatch;

import java.util.concurrent.CyclicBarrier;

public class Beer {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, ()->{
            System.out.println("drink beer!");
        });
        new Thread(new CWorker(cyclicBarrier)).start();
        for (int i = 0; i < 9; i++) {
            Thread thread = new Thread(new BWorker(i,cyclicBarrier));
            thread.start();
        }

    }

}
