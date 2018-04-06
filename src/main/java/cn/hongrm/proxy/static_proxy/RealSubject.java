package cn.hongrm.proxy.static_proxy;

/**
 * created by hongrm on 2018/4/6 23:39
 */
public class RealSubject implements Subject{
    @Override
    public void print() {
        System.out.println("RealSubject is running ");
    }
}
