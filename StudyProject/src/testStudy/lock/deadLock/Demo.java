package testStudy.lock.deadLock;

public class Demo {
    public static void main(String[] args) {
        ShareObject shareObject = new ShareObject();
        Thread thread1 = new Thread(new Task1(shareObject));
        Thread thread2 = new Thread(new Task2(shareObject));
        thread1.start();
        thread2.start();
    }
}
