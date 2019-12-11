package testStudy.Thread.safe;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            int i = 0;
            while (i < 10000) {
                System.out.println("2");
                i++;
            }
        });
        Thread t2 = new Thread(() -> {
            int i = 0;
            while (i < 10000) {
               System.out.println("3");
                i++;
            }
        });
        t1.start();
        t2.start();
        int i=0;

        while (i < 10000){
            System.out.println("1");
            i++;
        }

        System.out.println(Count.count.number);
    }
}
