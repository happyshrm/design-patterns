package cn.hongrm.singleton;

import cn.hongrm.base.HelloBase;

/**
 * @author happyhrm
 * 双重锁的单例模式
 * jdk1.5之后用得比较多
 */
public class DoubleLockSingleton implements HelloBase{
	//必须要用volatile来修饰instance,不然会因为内存可见性的问题而导致instance被重新赋值
	private static volatile DoubleLockSingleton instance= null;
	
	private DoubleLockSingleton() {}
	public static DoubleLockSingleton getInstance() {
		if(instance == null) {
			synchronized (DoubleLockSingleton.class) {
				if (instance == null)
					instance = new DoubleLockSingleton();
			}
		}
		return instance;
	}
}
