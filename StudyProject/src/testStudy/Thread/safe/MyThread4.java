package testStudy.Thread.safe;

import java.util.concurrent.Callable;

public class MyThread4 implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(2000);
        return "OK";
    }
}
