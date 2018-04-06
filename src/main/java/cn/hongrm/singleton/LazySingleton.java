package cn.hongrm.singleton;

import cn.hongrm.base.HelloBase;

/**
 * 懒汉模式
 */
public class LazySingleton implements HelloBase{
	private static LazySingleton instance;
	
	private LazySingleton() {}

	public static LazySingleton getInstance() {
		// 存在线程安全问题,这里的判断并赋值并不是原子操作
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
