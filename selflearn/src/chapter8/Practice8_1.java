package chapter8;

public class Practice8_1 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println("");
		System.out.println("問2");
		q2();

	}
	
	public static void q1() {
		System.out.println("クラスやメンバーに対するアクセス許可の範囲を管理している。\n"
				+ "宣言の先頭に追記する。\n"
				+ "特に指定しないとパッケージプライベートとみなされる。(パッケージ内のみアクセス可能)");

	}
	
	public static void q2() {
		System.out.println("データの読み書きを制御するため\n"
				+ "フィールド値を設定する際に値を検証できる\n"
				+ "フィールド値を参照する際に値を加工できる");

	}

}
