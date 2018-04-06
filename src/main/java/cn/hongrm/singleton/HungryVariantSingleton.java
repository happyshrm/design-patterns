package cn.hongrm.singleton;

import cn.hongrm.base.HelloBase;

/**
 * @author happyhrm
 * 饿汉模式的变种
 */
public class HungryVariantSingleton implements HelloBase{
	private static HungryVariantSingleton instance = null;
	static {
		instance = new HungryVariantSingleton();
	}
	private HungryVariantSingleton() {}
	public static HungryVariantSingleton getInstance() {
		return instance;
	}
}
