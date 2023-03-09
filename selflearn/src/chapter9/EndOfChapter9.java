package chapter9;

import chapter8.Hamster;

public class EndOfChapter9 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println("");
		System.out.println("問2");
		q2();
		System.out.println("");
		System.out.println("問3");
		q3();
		System.out.println("");
		System.out.println("問4");
		System.out.println("IAnimalの4行目default追加");
		System.out.println("Hamsterの3行目extendsをimplementsへ変更");
		System.out.println("Hamsterの10行目override不要");
		var q4 = new Hamster("たろう");
		q4.move();
	}
	
	public static void q1() {
		System.out.println("×：catchブロックは、発生した例外がcatchブロックのそれと一致した場合にだけ実行される。");
		System.out.println("→上記または派生クラスの場合に呼び出される。");
		System.out.println("×：メンバークラスは、エンクロージングクラスとの関係を明確にるために、エンクロージングクラス"
				+ "のインスタンスが不要な場合も、非Staticとして宣言すべきである。");
		System.out.println("→メンバークラスは可能な限りstatic宣言する。");
		System.out.println("〇：匿名クラスは、コンストラクターを持つことはできないが、初期化ブロックを持つことはできる。");
		System.out.println("→コンストラクターを持つことはできないが、初期化ブロックは可");
		System.out.println("×：列挙型ですべての列挙定数を取得するには、nameメソッドを利用する。");
		System.out.println("→nameではなくvaluesメソッド");
		System.out.println("×：Parent,Child型に継承関係がある場合、ArraysList<Parent>型の変数には無条件にArrayList<Child>型の値を代入できる。");
		System.out.println("→無条件で代入はできない。<? extends Parent>境界ワイルドカード型を提示する必要がある。");
	}
	
	public static void q2() {
		System.out.println("①：<T>");
		System.out.println("②：<? super T>");
		System.out.println("③：T...");
		System.out.println("④：add");
		System.out.println("⑤：result");
	}
	
	public static void q3() {
		System.out.println("①：implements Cloneable");
		System.out.println("②：@Override");
		System.out.println("③：Person");
		System.out.println("④：(Person)super.clone()");
		System.out.println("⑤：this.memos.clone()");
		System.out.println("⑥：CloneNotSupportedException");
	}

}