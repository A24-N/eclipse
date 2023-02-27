package chapter6;

import java.util.ArrayList;

public class CollInitial {

	public static void main(String[] args) {
		var data = new ArrayList<String>() {
			{
				add("バラ");
				add("ひまわり");
				add("あさがお");
			}
		};
		
		
		var ite = data.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
//			下記で書き換え可能
//			for (var s : data) {
//			System.out.println(s);
//		}
		System.out.println();
//		逆順で表示
		IteratorList(data);
//		頭の要素から1つずつ削除
		System.out.println();
		IteratorRmove(data);
	}
	
	public static void IteratorRmove(ArrayList<String> data) {
		var ite = data.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
			ite.remove();
			System.out.println(data);
		}
	}
	
	public static void IteratorList(ArrayList<String> data) {
		var ite = data.listIterator(data.size());
		while (ite.hasPrevious()) {
			System.out.println(ite.previous());
		}
	}
}
