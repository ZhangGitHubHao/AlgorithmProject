package testStudy;

public class JDKProxyImpl implements JDKProxyInterface {
    @Override
    public String method1() {
        System.out.println("方法1");
        return null;
    }

    @Override
    public void method2() {
        System.out.println("方法2");
    }

    @Override
    public int method3(int x) {
        System.out.println("方法3");
        return 0;
    }
}
