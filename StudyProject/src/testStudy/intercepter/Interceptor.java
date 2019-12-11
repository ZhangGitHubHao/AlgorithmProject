package testStudy.intercepter;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 860118060
 */
public interface Interceptor {
    /**
     * 真实对象前调用
     * @param proxy 代理对象
     * @param target  真实对象
     * @param method  方法
     * @param args  运行参数
     * @return true反射真实对象方法   false执行around方法
     */
    public boolean before(Object proxy, Object target, Method method,Object[] args);

    public void around(Object proxy, Object target, Method method,Object[] args);

    public void after(Object proxy, Object target, Method method,Object[] args);
}
