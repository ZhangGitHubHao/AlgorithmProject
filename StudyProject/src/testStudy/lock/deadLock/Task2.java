package testStudy.lock.deadLock;

public class Task2 implements Runnable{
    ShareObject obj;

    public Task2(ShareObject obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            obj.rightLeft();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
