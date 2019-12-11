package testStudy.Thread;

import java.util.concurrent.Callable;

public class MyThread3 implements Callable {
    @Override
    public Object call() throws Exception {
        return "hello world";
    }
}
