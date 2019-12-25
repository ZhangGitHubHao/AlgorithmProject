package testStudy.lock.deadLock;

public class Task1 implements Runnable {
    ShareObject obj;

    public Task1(ShareObject obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            obj.leftRight();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
