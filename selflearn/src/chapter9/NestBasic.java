package chapter9;

public class NestBasic {

	public static void main(String[] args) {
		var c = new MyClass();
		c.run();
		
//		var h = new MyClass.MyHelper(); エラー
	}

}
