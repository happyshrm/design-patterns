package cn.hongrm.base;

import cn.hongrm.constant.HelloConst;

/**
 * created by hongrm on 2018/4/1 15:38
 */
public interface HelloBase {
    default void print(){
        System.out.println(HelloConst.HELLO);
    }
}
