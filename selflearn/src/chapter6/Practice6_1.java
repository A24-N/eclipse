package chapter6;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice6_1 {

	public static void main(String[] args) {
		System.out.println("問1");
		Q1();
		System.out.println();
		System.out.println("問2");
		Q2();

	}
	
	public static void Q1() {
		System.out.println("クラスやメソッドを特定の型に紐づける機能\n"
				+ "特定の型を扱うための専用のリストを作る。と宣言することで\n"
				+ "コンパイル時のエラーをチェックしたり、値を取り出すときのキャストも不要になる。");
	}
	
	public static void Q2() {
		var list = new ArrayList<Integer>(Arrays.asList(16, 24, 30 ,39));
		System.out.println(list);
	}

}
