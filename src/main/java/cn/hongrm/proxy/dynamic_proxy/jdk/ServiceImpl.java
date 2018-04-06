package cn.hongrm.proxy.dynamic_proxy.jdk;

/**
 * created by hongrm on 2018/4/6 23:48
 */
public class ServiceImpl implements Service {
    @Override
    public void print() {
        System.out.println("ServiceImpl is running.......");
    }
}
