package chapter9;

public class MyClass {
//	staticメンバークラスの定義
	private static class MyHelper {
		public void show() {
			System.out.println("Nested class is running!");
		}
	}
	
	public void run() {
		var helper = new MyHelper();
		helper.show();
	}
}
