package testStudy.lock.deadLock2;

public class Demo {
    public static void main(String[] args) {
        ShareData shareData = new ShareData(new Object(),new Object());
        Thread thread1 = new Thread(new Task1(shareData));
        Thread thread2 = new Thread(new Task2(shareData));
        thread1.start();
        thread2.start();
    }

}
