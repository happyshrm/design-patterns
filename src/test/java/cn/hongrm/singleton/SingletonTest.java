package cn.hongrm.singleton;

import org.junit.Test;

/**
 * created by hongrm on 2018/4/1 13:00
 */
public class SingletonTest {

    @Test
    public void enumSingletonTest(){
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.printHello();
    }
}
