package chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollAsList {

	public static void main(String[] args) {
		var data = new String[] { "バラ", "ひまわり", "あさがお" };
		collAsList(data);
		System.out.println();
		collAddAll(data);
		System.out.println();
		collToArray();
	}
	
	public static void collAsList(String[] data) {
		
		var list = Arrays.asList(data);
		list.set(0, "チューリップ");
		System.out.println(list);
		System.out.println(Arrays.toString(data));
//		以下はエラーが発生する 配列のサイズ変更はできない為
//		list.add("さくら");
//		list.remove(0);
	}
	
	public static void collAddAll(String[] data) {
//		リストの要素数を変更する場合はコピーを作成し編集する
		var list = new ArrayList<String>();
//		Collections.addAllでlist←dataをコピーする
		Collections.addAll(list,  data);
		list.add("さくら");
		list.remove(0);
//		元のdataは書き換えられていない
		System.out.println(list);
		System.out.println(Arrays.toString(data));
	}
	
	public static void collToArray() {
		var data = new ArrayList<String>(Arrays.asList("バラ", "ひまわり", "あさがお"));
//		リストと同じサイズの配列にdataリストをコピー
		var strs = new String[data.size()];
		data.toArray(strs);
//		値を変更して、配列/リストの中身を確認
		data.set(0,"チューリップ");
		System.out.println(Arrays.toString(strs));
		System.out.println(data);
	}

}
