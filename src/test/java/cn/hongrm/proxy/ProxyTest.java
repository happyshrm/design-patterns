package cn.hongrm.proxy;

import cn.hongrm.proxy.dynamic_proxy.cglib.MyInterceptor;
import cn.hongrm.proxy.dynamic_proxy.cglib.UserServiceImpl;
import cn.hongrm.proxy.dynamic_proxy.jdk.Service;
import cn.hongrm.proxy.dynamic_proxy.jdk.ServiceImpl;
import cn.hongrm.proxy.dynamic_proxy.jdk.ServiceInvocationHandler;
import cn.hongrm.proxy.static_proxy.Proxy;
import cn.hongrm.proxy.static_proxy.RealSubject;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * created by hongrm on 2018/4/6 23:44
 */
public class ProxyTest {
    @Test
    public void staticProxyTest() {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.print();
    }

    @Test
    public void jdkProxyTest() {
        Service service = new ServiceImpl();
        ServiceInvocationHandler invocationHandler = new ServiceInvocationHandler(service);
        Service serviceProxy = (Service) invocationHandler.getProxy();
        serviceProxy.print();
    }

    @Test
    public void cglibProxyTest() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new MyInterceptor());
        UserServiceImpl userServiceImpl = (UserServiceImpl) enhancer.create();
        userServiceImpl.print();
    }

}
