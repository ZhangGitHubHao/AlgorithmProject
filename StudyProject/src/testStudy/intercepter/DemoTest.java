package testStudy.intercepter;

public class DemoTest {
    public static void testInterceptor() {
        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),
                "testStudy.intercepter.MyInterceptor");
        User user = new User("张三",22,"打篮球");
        proxy.printHello(user);
    }

    public static void main(String[] args) {
        testInterceptor();
    }
}
