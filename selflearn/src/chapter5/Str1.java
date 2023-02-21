package chapter5;

public class Str1 {

	public static void main(String[] args) {
		System.out.println("StrLength");
		StrLength();
		System.out.println();
		System.out.println("StrCodePoint");
		StrCodePoint();
	}
	
	public static void StrLength() {
		var str1 = "こんにちわ、さようなら";
			System.out.println(str1.length()); //11
			
//			サロゲートペアを識別できない為、4バイト=2文字としてカウントしている。
		var str2 = "𪛊𪛊";
			System.out.println(str2.length()); //4
	}
	
	public static void StrCodePoint() {
		var str = "𪛊𪛊";
			System.out.println(str.codePointCount(0, str.length())); //2
	}
}
