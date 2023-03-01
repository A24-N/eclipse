package chapter7;

public class FactoryClass {
//	privateなコンストラクター
	private FactoryClass() {
		
	}

//	ファクトリーメソッド
	public static FactoryClass getInstance() {
		return new FactoryClass();
	}

}
