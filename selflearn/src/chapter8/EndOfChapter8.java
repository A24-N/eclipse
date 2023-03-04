package chapter8;

public class EndOfChapter8 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println("");
		System.out.println("問2");
		q2();
		System.out.println("");
		System.out.println("問3");
		System.out.println("3.4行目publicではなくprivate");
		System.out.println("8行目voidを削除");
		System.out.println("9行目superではなくthis");
		System.out.println("13.14行目this.をつける");
		System.out.println("22行目Stringではなくvoid");
		System.out.println("39行目$ではなく%");
		Animal q3 = new Animal();
		q3.setName("タナk");
		q3.setAge(-25);
		System.out.printf(q3.intro());
		System.out.println("");
		System.out.println("");
		System.out.println("問4");
		System.out.println("IAnimalの4行目default追加");
		System.out.println("Hamsterの3行目extendsをimplementsへ変更");
		System.out.println("Hamsterの10行目override不要");
		var q4 = new Hamster("たろう");
		q4.move();
	}
	
	public static void q1() {
		System.out.println("×：派生クラスから基底クラスのメソッドを呼び出すのは、thisキーワードを利用する。");
		System.out.println("→派生クラスから基底クラスはsuperを利用する。");
		System.out.println("×：基底クラスのメソッドを派生クラスで再定義した場合、@Overrideアノテーションの宣言は必須である。");
		System.out.println("→必須ではない。しかし、オーバーライドの条件を満たさなかった場合などコンパイラーが通知してくれる。");
		System.out.println("×：抽象クラスのメソッドはすべて実装(本体)を持ってはならない。");
		System.out.println("抽象クラスは以下の抽象メソッドは、もってはならない。"
				+ "本体を持った、普通のーーいわゆる非抽象メソッドを持つこともできる。");
		System.out.println("〇：instanceof演算子は左オペラントが右オペラントの型に変換できる場合にtrueを返す。");
		System.out.println("→変換できる場合にtrueを返す。");
		System.out.println("×：インターフェースを複数実装することはできるが、クラスと一緒に実装することはできない。");
		System.out.println("→可能。extends→implementsの順で記述する。");
	}
	
	public static void q2() {
		System.out.println("①：interface");
		System.out.println("②：default");
		System.out.println("③：extends");
		System.out.println("④：imprements");
		System.out.println("⑤：IFather.super");
		System.out.println("⑥：IMother.super");
	}
	
	public static void q4() {
		System.out.println("①：format");
		System.out.println("②：%.2f");
		System.out.println("③：extends");
		System.out.println("④：@Override");
		System.out.println("②：super.show()");

	}

}