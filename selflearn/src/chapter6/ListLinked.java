package chapter6;

import java.util.Arrays;
import java.util.LinkedList;

public class ListLinked {

	public static void main(String[] args) {
		var list = new LinkedList<String>(Arrays.asList("うさぎ", "たつ", "へび"));
		System.out.println(list);
		
//		リストの先頭に要素を追加
		list.addFirst("とら");
//		リストの末尾に要素を追加
		list.addLast("うま");
		System.out.println(list);
//		リストの先頭要素を取得
		System.out.println(list.getFirst());
//		リストの末尾要素を取得
		System.out.println(list.getLast());
//		リストの先頭要素を削除
		System.out.println(list.removeFirst());
//		リストの末尾要素を削除
		System.out.println(list.removeLast());
		System.out.println(list);
		
	}

}
