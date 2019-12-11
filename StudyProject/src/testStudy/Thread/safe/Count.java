package testStudy.Thread.safe;

public class Count {
    public int number = 10000;
    public static Count count = new Count();

    public static Count getInstance(){
        return count;
    }
    private Count() {
    }
    synchronized void addNum(){
        number++;
    }
    synchronized void removeNum(){
        number--;
    }
}
