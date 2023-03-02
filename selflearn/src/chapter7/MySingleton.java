package chapter7;

public class MySingleton {
	private static MySingleton instance = new MySingleton();
	
	private MySingleton() {}
	
//	あらかじめ用意しておいたインスタンスを取得
	public static MySingleton getInstance() {
		return instance;
	}
}
