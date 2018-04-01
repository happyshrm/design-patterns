package cn.hongrm.singleton;

/**
 * @author happyhrm
 * 饿汉模式的变种
 */
public class HungryVariantSingleton {
	private static HungryVariantSingleton instance = null;
	static {
		instance = new HungryVariantSingleton();
	}
	private HungryVariantSingleton() {}
	public static HungryVariantSingleton getInstance() {
		return instance;
	}
}
