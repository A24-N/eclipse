package chapter6;

import java.util.ArrayList;
import java.util.Arrays;

public class SortList {

	public static void main(String[] args) {
//		配列をソート
		var data = new String[] { "バラ", "ひまわり", "チューリップ", "さくら" };
		Arrays.sort(data, (x,y) -> x.length() - y.length());
		System.out.println(Arrays.toString(data));
		
//		リストをソート
		var list = new ArrayList<String>(Arrays.asList("バラ", "ひまわり", "チューリップ", "さくら"));
		list.sort((x,y) -> x.length() - y.length());
		System.out.println(list);

	}

}
