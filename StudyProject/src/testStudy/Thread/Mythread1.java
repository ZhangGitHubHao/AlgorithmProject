package testStudy.Thread;

public class Mythread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程2:"+i);
        }
    }
}
