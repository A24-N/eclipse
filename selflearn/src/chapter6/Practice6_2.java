package chapter6;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice6_2 {

	public static void main(String[] args) {
		System.out.println("①：<Integer>");
		System.out.println("②：remove");
		System.out.println("③：20");
		System.out.println("④：2");
		System.out.println("⑤：i");
		System.out.println();
		
		var list = new ArrayList<Integer>(Arrays.asList(10, 15, 30));
		var list2 = new ArrayList<Integer>(Arrays.asList(60, 90));
		
		list.remove(0);
		list.set(1, 20);
		list.addAll(list2);
		for (var i : list) {
			System.out.print(i + " ");
		}
		
	}

}
