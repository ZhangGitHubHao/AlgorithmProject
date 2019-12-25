package testStudy.jdkproxydemo.proxydemo1;

public class DemoTest {
    public static void main(String[] args) {
        Hello bainianProxy =(Hello) BainianProxy.bind(new HelloImpl(),"testStudy.jdkproxydemo.proxydemo1");
    }
}
