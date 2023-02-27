package chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollUnmodify {

	public static void main(String[] args) {
		collUnmodify();
		System.out.println();
		collUnmodifyRef();
		System.out.println();
		collUnmodifyOf();
	}
	
	public static void collUnmodify() {
		var data = new ArrayList<String>(Arrays.asList("バラ", "ひまわり", "あさがお"));
		var udata = Collections.unmodifiableList(data);
//		以下は変更不能につきエラーが発生する
//		udata.set(0, "チューリップ");
//		udata.add("さくら");
		System.out.println(udata);
	}
	
	public static void collUnmodifyRef() {
//		String型に対しては制限できるがStringBuilder型などには制限をかけることはできない
		var data = new ArrayList<StringBuilder>(Arrays.asList(
				new StringBuilder("ひふみ"),
				new StringBuilder("よいむ"),
				new StringBuilder("なやこ"))
			);
		var udata = Collections.unmodifiableList(data);
		udata.get(0).append("いちにさん");
		System.out.println(udata);
	}
	
	public static void collUnmodifyOf() {
		var data = List.of("バラ", "ひまわり", "あさがお");
//		以下、ofメソッドによりリストの編集に制限がかかっている為エラーが発生する
//		data.add("さくら");
		System.out.println(data);
	}

}
