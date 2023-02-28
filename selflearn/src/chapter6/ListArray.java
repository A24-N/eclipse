package chapter6;

import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>(Arrays.asList(10, 15, 30 ,60));
		var list2 = new ArrayList<Integer>(Arrays.asList(1, 5, 3, 6));
		var list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		
		for (var i : list) {
			System.out.print(i / 5 + ", ");
		}
//		リストの要素数を取得
		System.out.println("\n" + list.size());
//		index番目の要素を取得→0番目の要素を取得
		System.out.println(list.get(0));
//		指定の要素を含むか
		System.out.println(list.contains(30));
		System.out.println(list.containsAll(list2));
//		指定要素の位置を検索。指定要素がない場合は-1を返す。lastIndexOfは後ろから検索する。
		System.out.println(list.indexOf(30));
		System.out.println(list.lastIndexOf(30));
//		listが空かチェック
		System.out.println(list.isEmpty());
//		対象の要素を削除する。
		System.out.println(list.remove(0));
		System.out.println(list);
		
//		指定したIndex番目にコレクションを挿入。Indexを指定しない場合は末尾に挿入。
		list.addAll(1,list2);
		System.out.println(list);
//		指定したコレクション内の要素をすべて削除。
		list.removeAll(list3);
		System.out.println(list);
		
//		Index番目の要素を設定
		list.set(0,100);
//		要素を配列にコピー
		var data = list.toArray();
		System.out.println(Arrays.toString(data));
	}

}
