package testStudy.singletonDemo;

public class Counter {
    public int count = 0;
    private static Counter counter = new Counter();
    private Counter(){};
    public static Counter getInstance(){
        return counter;
    }
    public void addCount(){
        count++;
    }
}
