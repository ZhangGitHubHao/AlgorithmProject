package testStudy.intercepter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InterceptorJdkProxy implements InvocationHandler {

    /**
     * 创建真实对象
     */
    private Object target;

    /**
     * 拦截器全限定名
     */
    private String interceptorClass = null;

    public InterceptorJdkProxy(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    /**
     * 绑定委托对象并返回一个代理对象
     *
     * @param target           真实对象
     * @param interceptorClass
     * @return 代理对象占位
     */
    public static Object bind(Object target, String interceptorClass) {
        // 取得代理占位
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InterceptorJdkProxy(target, interceptorClass));
    }

    /**
     * 通过代理对象调用方法,首先先进入这个方法
     *
     * @param proxy  代理对象
     * @param method 被调用的方法
     * @param args   方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (interceptorClass == null) {
            // 如果没有设置拦截器则反射原有方法
            return method.invoke(target, args);
        }
        Object result = null;
        // 通过反射生成拦截器
        Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();
        if (interceptor.before(proxy, target, method, args)) {
            result =  method.invoke(target, args);
        } else {
            interceptor.around(proxy,target,method,args);
        }
        interceptor.after(proxy,target,method,args);
        return result;
    }
}
