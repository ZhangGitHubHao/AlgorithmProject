package testStudy.lock.deadLock2;

public class ShareData {
    Object obj1;
    Object obj2;

    public ShareData(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void getLock1(){
        synchronized (obj1){
            String name = Thread.currentThread().getName();
            System.out.println(name+":锁住obj1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2){
                System.out.println(name+":锁住obj2");
            }
        }
    }
    public void getLock2(){
        synchronized (obj2){
            String name = Thread.currentThread().getName();
            System.out.println(name+":锁住obj2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1){
                System.out.println(name+":锁住obj1");
            }
        }

    }
}
