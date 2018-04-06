package cn.hongrm.singleton;

import cn.hongrm.base.HelloBase;

/**
 * @author happyhrm
 * 饿汉模式,一开始就加载好了
 */
public class HungrySingleton implements HelloBase{
	private static HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton() {}
	public static HungrySingleton getInstance() {
		return instance;
	}
}
