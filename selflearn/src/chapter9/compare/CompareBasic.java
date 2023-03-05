package chapter9.compare;

import java.util.Arrays;

public class CompareBasic {

	public static void main(String[] args) {
		var data = new Person[] {
				new Person("タロウ", "マツダ"),
				new Person("チエ", "マツダイラ"),
				new Person("コウタロウ", "マエダ"),
				new Person("タロウノスケ", "アンドウ"),
				new Person("タマエ", "コノミ"),
				new Person("リコ", "リコ"),
		};
		
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));

	}

}
