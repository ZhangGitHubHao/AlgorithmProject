package testStudy.lock.deadLock2;

public class Task2 implements Runnable{
    ShareData shareData;

    public Task2(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        shareData.getLock2();
    }
}
