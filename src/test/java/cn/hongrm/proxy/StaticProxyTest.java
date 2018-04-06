package cn.hongrm.proxy;

import cn.hongrm.proxy.dynamic_proxy.jdk.Service;
import cn.hongrm.proxy.dynamic_proxy.jdk.ServiceImpl;
import cn.hongrm.proxy.dynamic_proxy.jdk.ServiceInvocationHandler;
import cn.hongrm.proxy.static_proxy.Proxy;
import cn.hongrm.proxy.static_proxy.RealSubject;
import org.junit.Test;

/**
 * created by hongrm on 2018/4/6 23:44
 */
public class StaticProxyTest {
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

}
