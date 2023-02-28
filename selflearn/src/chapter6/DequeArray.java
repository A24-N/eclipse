package chapter6;

import java.util.ArrayDeque;

public class DequeArray {

	public static void main(String[] args) {
//		 スタック（末尾から要素を追加し、取り出す。）
		var data = new ArrayDeque<Integer>();
		data.addLast(10);
		data.addLast(15);
		data.addLast(30);
		
		System.out.println(data);
		System.out.println(data.removeLast());
		System.out.println(data);
		
		System.out.println();
		
//		キュー（末尾から要素を追加し、先頭から取り出す。）
		var data2 = new ArrayDeque<Integer>();
		data2.addLast(10);
		data2.addLast(15);
		data2.addLast(30);
		
		System.out.println(data2);
		System.out.println(data2.removeFirst());
		System.out.println(data2);
		
		System.out.println();
		
	}

}
