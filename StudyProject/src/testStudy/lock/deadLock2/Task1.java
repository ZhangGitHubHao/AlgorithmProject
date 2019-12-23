package testStudy.lock.deadLock2;

public class Task1 implements Runnable {
    ShareData shareData;

    public Task1(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        shareData.getLock1();
    }
}
