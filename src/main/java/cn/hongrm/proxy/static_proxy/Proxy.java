package cn.hongrm.proxy.static_proxy;

/**
 * created by hongrm on 2018/4/6 23:41
 */
public class Proxy implements Subject{

    Subject subject ;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void print() {
        System.out.println("before RealSubject running");
        subject.print();
        System.out.println("after RealSubject running");
    }


}
