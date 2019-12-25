package testStudy.jdkproxydemo;

import testStudy.intercepter.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ArrayHanderJdkProxy implements InvocationHandler {
    private Object target;
    /**
     * 全限定名
     */
    private String arrHander = null;

    public ArrayHanderJdkProxy(Object target,String arrHander) {
        this.target = target;
        this.arrHander = arrHander;
    }

    public static Object bind(Object target,String arrHander){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new ArrayHanderJdkProxy(target,arrHander));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (arrHander == null) {
            return method.invoke(target, args);
        }
        Object result = null;
        int[] arr = (int[])args[0];
        // 通过反射生成处理器
        ArrayHander arrayHander = (ArrayHander) Class.forName(arrHander).newInstance();
        result = arrayHander.sortArray(args);
        return result;
    }
}
