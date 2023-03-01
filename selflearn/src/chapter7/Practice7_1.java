package chapter7;

public class Practice7_1 {

	public static void main(String[] args) {
		System.out.println("問1");
		Q1();
		System.out.println();
		PClass a = new PClass();
		a.hoge(a.data);
		System.out.println("問2");
		Q2();

	}
	
	public static void Q1() {
		System.out.println("①：protected class PClass → public class PClass");
		System.out.println("②：public var data → public Integer data");
		System.out.println("③：var data = 0; → data = 0;");
	}
	
	public static void Q2() {
		System.out.println("フィールドは、class{...}の中で宣言された変数。\n"
				+ "メソッドの中で宣言された変数をローカル変数という。\n"
				+ "フィールドはクラス内で使える変数だが、ローカル変数はメソッド内でしか利用できない。");
	}

}
