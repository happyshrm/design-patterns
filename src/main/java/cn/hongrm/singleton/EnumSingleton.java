package cn.hongrm.singleton;

import cn.hongrm.constant.HelloConst;

/**
 * created by hongrm on 2018/4/1 12:57
 */
public enum  EnumSingleton {
    INSTANCE;
    // some methods
    void printHello(){
        System.out.println(HelloConst.HELLO);
    }
}
