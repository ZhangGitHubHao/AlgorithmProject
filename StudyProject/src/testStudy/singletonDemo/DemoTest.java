package testStudy.singletonDemo;

public class DemoTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread("123");
        thread.start();

        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        method3(nums1);
        method3(nums2);
        Thread.sleep(5000);
        Counter counter = Counter.getInstance();
        System.out.println(counter.count);
    }

    private static void method3(int[] nums){
       Counter counter = Counter.getInstance();
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               for (int i:nums) {
                   counter.addCount();
               }
           }
       };
       Thread thread1 = new Thread(runnable);
       thread1.start();
    }

    private static void method1(){
        MenuList menus = MenuList.getMenuList();
        menus.addMenu("红烧肉");
        FruitList fruitList = FruitList.getFruitList();
        fruitList.addFruit("苹果");
    }
    private static void method2(){
        MenuList menus = MenuList.getMenuList();
        for (String str:menus.getMenus()) {
            System.out.println(str);
        }
        FruitList fruitList =FruitList.getFruitList();
        for (String str:fruitList.getFruits()) {
            System.out.println(str);
        }
    }
    MyThread mythread;
}
class MyThread extends Thread{
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("hello "+name);
    }
}
