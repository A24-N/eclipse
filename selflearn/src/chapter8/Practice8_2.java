package chapter8;

public class Practice8_2 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println("");
		System.out.println("問2");
		q2();

	}
	
	public static void q1() {
		System.out.println("修飾子：final\n"
				+ "継承可能なクラスは、実装/修正時も派生クラスへの影響を配慮しなければならない。\n"
				+ "派生クラス側からもどのクラス/メソッドが｢安全に｣継承できるかを選別する必要がある。\n"
				+ "基底/派生のクラス実装を難しくする。");

	}
	
	public static void q2() {
		System.out.println("(〇) Man m = new BusinessMan();");
		System.out.println("派生クラスから基底クラスへのアップキャストは無条件で可能");
		System.out.println("(〇) BusinessMan bm = (BusinessMan)m;");
		System.out.println("基底クラスから派生クラスへのダウンキャストは明示的な変換が必要");
		System.out.println("(△) StudentMan s = (StudentMan)m;");
		System.out.println("継承関係にあるManからStudentManへのダウンキャストはKンパイルは通過する。\n"
				+ "しかし、変数ｍの実体はBusinessManなので実行時にエラーが発生する。");
		System.out.println("(×) StudentMan s2 = (StudentMan)bm;");
		System.out.println("BusinessManとStudentManの間には継承関係はないので、キャストできない。");
	}

}