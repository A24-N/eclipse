package chapter7;

public class EndOfChapter7 {

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
		q4();
	}
	
	public static void q1() {
		System.out.println("①：アクセス修飾子");
		System.out.println("②：protected");
		System.out.println("③：private");
		System.out.println("④：static修飾子");
		System.out.println("⑤：クラスメンバー");
		System.out.println("⑥：定数");
		System.out.println("⑦：final");
		System.out.println("⑧：可変長");
		System.out.println("⑨：...");
		System.out.println("⑩：配列");
	}
	
	public static void q2() {
		System.out.println("×：フィールド/メソッドは外部から呼び出すことが前提の仕組みなので、アクセス修飾子も規定はpublicである。");
		System.out.println("→規定はパッケージプライベート(同じパッケージのクラスのみアクセス可能\n"
				+ "異なるパッケージからアクセスするには、明示的にpublicなどの修飾子が必要。)");
		System.out.println("×：データ型が異なっていれば。同じクラスに同名のフィールドを定義してもよい。");
		System.out.println("→同名のフィールドは存在してはならない。");
		System.out.println("×：フィールドとローカル変数の名前は重複してはならない。");
		System.out.println("重複はできるが変数を使う場合にフィールドはthisを宣言してあげる。");
		System.out.println("×：forループで宣言されたカウンター変数は、登場以降、そのメソッドの内部であればアクセス可能である。");
		System.out.println("→アクセスすることはできない。アクセスできるのはそのブロック内のみ");
		System.out.println("〇：パッケージは、インターネットドメインを逆順にしたものを元に命名すべきである。");
		System.out.println("→一応Javaとしては推奨している。");
	}
	
	public static void q3() {
		System.out.println("①：string");
		System.out.println("②：age");
		System.out.println("③：this");
		System.out.println("④：\"権兵衛\", 0");
		System.out.println("⑤：void");
		System.out.println("⑥：printf");
	}
	
	public static void q4() {
		System.out.println("①：100");
		System.out.println("②：100");
		System.out.println("{ 100, 200, 300}の場合");
		System.out.println("①：100");
		System.out.println("②：10");

	}

}
