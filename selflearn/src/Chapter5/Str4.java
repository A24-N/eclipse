package Chapter5;

public class Str4 {
	
	public static void main(String[] args) {
		System.out.println("StrSubstring");
		StrSubstring();
		System.out.println();
		System.out.println("StrCharAt");
		StrCharAt();
		System.out.println();
		System.out.println();
		System.out.println("StrSplit");
		StrSplit();
	}
	
	public static void StrSubstring() {
		var str = "WINGSプロジェクト";
		System.out.println(str.substring(5,7)); //プロ
//		System.out.println(str.substring(5,2)); //エラー :begin > end なため
//		System.out.println(str.substring(-5)); //エラー :beginが負数なため
//		System.out.println(str.substring(15)); //エラー :文字列の末尾を超えるため
		
		var mail = "test@mail.com";
		System.out.println(mail.substring(mail.lastIndexOf("@") + 1)); //mail.com
	}
	
	public static void StrCharAt() {
		var mail = "test@mail.com";
		System.out.println(mail.charAt(0));
		
		for (var i =0; i < mail.length(); i++) {
			System.out.print(mail.charAt(i));
			System.out.print(",");
		}		
	}
	
	public static void StrSplit() {
		var str1 = "うめ,もも,さくら";
		var result1 = str1.split(",");
		System.out.println(String.join("＆", result1));
		
		var str2 = "うめ,もも,さくらとあんず";
		var result2 = str2.split("[,と]");
		System.out.println(String.join("＆", result2));
		
		var str3 ="うめ,もも,さくら";
		var result3 = str3.split("");
		System.out.println(String.join("＆", result3));
		
		var str4 = "うめ,もも,さくら,あんず";
		var result4 = str4.split(",", 3);
		System.out.println(String.join("＆", result4));
		
		System.out.println(String.join("＆", "うめ", "さくら", "チョコボ"));
	}
}
