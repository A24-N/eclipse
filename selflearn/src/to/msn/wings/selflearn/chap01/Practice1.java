package to.msn.wings.selflearn.chap01;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
		
//		①var型推論を利用し、double型の変数valueを10で初期化する。
		var value = 10d;
		var type = ((Object)value).getClass().getSimpleName();
		System.out.println(type);
		
//		②「ようこそ、\nJavaの世界へ！」という改行を含んだ文字列を表示する。
		System.out.println(
				"「ようこそ、\nJavaの世界へ！」");
		
//		③String型の変数strを宣言し、初期値としてnullを渡す。
		String str = null;
		System.out.println(str);
		
//		④var推論を利用せず、int型で5×4サイズの多次元配列dataを宣言する。
		int[][] data = new int[5][4];
		System.out.println(Arrays.deepToString(data));
		
//		⑤var型推論を利用して、int型のギザギザな配列listを宣言する(中身は「2,3,5」「1,2」「10,11,12,13」)
		var list = new int[][] {
			{2,3,5},
			{1,2},
			{10,11,12,13}
		};
		System.out.println(Arrays.deepToString(list));
	}
}