package chapter9.practice9;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println("");
		System.out.println("問2");
		q2();
		System.out.println("");
	}
	
	public static void q1() {
		System.out.println("catchブロックの記述順に気を付ける。\n"
				+ "先に記述されたものを優先的に処理するため\n"
				+ "先頭の例外がすべて例外処理してしまうと\n"
				+ "以降の例外処理が実施されなくなってしまう。\n"
				+ "Exception例外を先頭に持ってきてしまうなど。");


	}
	public static void q2() {
		System.out.println("・例外内容を識別できるようにまずはException派生クラスからスローする。\n"
				+ "・回復可能な例外は検査例外。それ以外は非検査例外にて投げる。\n"
				+ "・できうる限り標準例外を利用する。用意されている例外以外を使用すると特殊な意味を勘繰られ可読性が落ちる。");

	}

}
