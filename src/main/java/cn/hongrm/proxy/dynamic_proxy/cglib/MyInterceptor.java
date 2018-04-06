package cn.hongrm.proxy.dynamic_proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * created by hongrm on 2018/4/7 0:04
 * cglib 不能代理final类
 * java.lang.IllegalArgumentException: Cannot subclass final class cn.hongrm.proxy.dynamic_proxy.cglib.UserServiceImpl
 * 被代理类的方法是final时,会出现不能覆写的情况
 */
public class MyInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before " + target.getClass().getName() + " running");
        Object object = methodProxy.invokeSuper(target, args);
        System.out.println("after " + target.getClass().getName() + " running");
        return object;
    }
}
