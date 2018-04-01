package cn.hongrm.singleton;

/**
 * @author happyhrm
 * 变种的懒汉模式
 */
public class LazyVariantSingleton {
	private static LazyVariantSingleton instance;
	private LazyVariantSingleton() {}

	//线程安全的,不过会导致多个线程竞争同个锁,并且99%的情况都是不需要实例化的
	public static synchronized LazyVariantSingleton getInstance() {
		if(instance == null)
			instance = new LazyVariantSingleton();
		return instance;
	}
}
