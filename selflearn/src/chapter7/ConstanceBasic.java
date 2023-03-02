package chapter7;

public class ConstanceBasic {
	public static void main(String[] args) {
		System.out.println(MyApp.BOOK_TITLE);
//		MyApp.BOOK_TITLE = "こんにちわ"; エラー：final フィールド MyApp.BOOK_TITLE には代入できません
		
		var app1 = new MyApp("独習JAVA");
		System.out.println(app1.APP_NAME);
		var app2 = new MyApp("こんにちわ赤ちゃん");
		System.out.println(app2.APP_NAME);
		System.out.println(Initializer.DOG);
		System.out.println(Initializer.CAT);
	}
}
