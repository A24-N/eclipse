package chapter6;

import java.util.Arrays;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		var ts = new TreeSet<Integer>(Arrays.asList(1, 20, 30, 10, 60, 15));
		
		System.out.println(ts);
//		逆順に表示
		System.out.println(ts.descendingSet());
//		指定の要素以上で最小のものを取得
		System.out.println(ts.ceiling(15));
//		指定の要素より小さい中で最大のものを取得
		System.out.println(ts.lower(15));
//		指定の要素以上の要素を取得
		System.out.println(ts.tailSet(15));
//		指定の要素より小さい要素を取得
		System.out.println(ts.headSet(30, true));

	}

}
