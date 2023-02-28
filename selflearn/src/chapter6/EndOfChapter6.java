package chapter6;

public class EndOfChapter6 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println("");
		System.out.println("問2");
		q2();
		System.out.println("");
		System.out.println("問3");
		q3();
	}
	
	public static void q1() {
		System.out.println("×：ArrayListへの挿入/削除は、位置に関わらずほぼ一定のスピードで可能である。");
		System.out.println("→要素の移動を行うため先頭に近いほど処理時間がかかる");
		System.out.println("×：LinkedListへの挿入/削除は要素前後のリンクの付け替えが発生するので、比較的低速である。");
		System.out.println("→リンクの付け替えは比較的高速である。");
		System.out.println("×：HashSetは要素の重複を許さず、一位の値を一定の順序で保持する");
		System.out.println("→重複は許さないが順序は管理しない。順序管理はTreeSet。");
		System.out.println("〇：HashMapは一意性のキーと値のペアでデータを管理してる。キーの並び順は保証されない。");
		System.out.println("×：スタックは先入れ先出し、キューは後入れ先出しと呼ばれるデータ構造。");
		System.out.println("→スタックが後入れ先出し、キューが先入れ先出し。");
	}
	
	public static void q2() {
		System.out.println("①：<String, String>");
		System.out.println("②：\"carrot\", \"ニンジン\"");
		System.out.println("③：remove");
		System.out.println("④：replice");
		System.out.println("⑤：entry.getKey()");
		System.out.println("⑥：entry.getValue()");
	}
	
	public static void q3() {
		System.out.println("1つ目：ArrayList→ArrayList<Integer>");
		System.out.println("→ジェネリック型なので<Integer>のような型パℜメータを明記する。");
		System.out.println("2つ目：for (string i : list)→for (var i : list)");
		System.out.println("→ArrayList<Integer>になるのでiはvarまたはint型でないといけない。");
		System.out.println("3つ目：remove(5)→remove(3)");
		System.out.println("→要素[4]を削除する場合はindex3の要素を削除する必要があるため。");
	}

}
