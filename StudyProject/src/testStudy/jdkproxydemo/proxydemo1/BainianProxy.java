package testStudy.jdkproxydemo.proxydemo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BainianProxy implements InvocationHandler {
    // 目标对象
    private Object target;

    /**
     * 全限定名
     */
    private String name = null;

    public BainianProxy(Object target,String name) {
        this.target = target;
        this.name = name;
    }

    public static Object bind(Object target,String arrHander){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new BainianProxy(target,arrHander));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (name == null) {
            return method.invoke(target, args);
        }
        int[] arr = (int[])args[0];
        // 通过反射生成处理器
        Bainian bainian = (Bainian) Class.forName(name).newInstance();
        bainian.sayHappyYear(args);
        return null;
    }
}
