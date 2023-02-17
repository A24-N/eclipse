
public class PracticeChapter3 {

	public static void main(String[] args) {
		System.out.println("問1");
		System.out.println("①：算術演算子");
		System.out.println("②：比較演算子");
		System.out.println("③：条件式 ? 式1 : 式2");
		System.out.println("④：論理演算子");
		System.out.println("⑤：<< >> >>> & ^");
		System.out.println("");
		
		System.out.println("問2");
		System.out.println("X=6, Y=4");
		System.out.println("builder1=いろはにほへと, builder2=いろはにほへと");
		System.out.println("");
		
		System.out.println("問3");
		System.out.println("endsWithメソッドだけを呼び出すことはできない。\n"
				+ "変数がnullの場合NullPointerException例外の原因になるため最初にnullチェックを行う。");
		
		String str = null;
		if(str != null && str.endsWith(".java")) {
			System.out.println("拡張子は.javaです。");
		}
		System.out.println("");
		
		System.out.println("問4");
		System.out.println("①：優先順位\n"
				+ "②：結合測\n"
				+ "③：高い\n"
				+ "④：同じ\n"
				+ "⑤：代入演算子");

	}

}
