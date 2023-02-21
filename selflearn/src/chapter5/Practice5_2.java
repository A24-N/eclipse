package chapter5;

import java.util.regex.Pattern;

public class Practice5_2 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println();
		System.out.println("問2");
		q2();
		System.out.println();
	}
	
	public static void q1() {
		var str = "住所は〒160-0000 新宿区南町0-0-0です。\nあなたの住所は〒210-9999 川崎市北町1-1-1ですね。";
		var ptn = Pattern.compile("〒([0-9]{3})-([0-9]{4})");
		var match = ptn.matcher(str);
		while (match.find()) {
			System.out.println(match.group());
		}
	}
	
	public static void q2() {
		var str = "お問い合わせはsupport@example.comまで";
		System.out.println(str.replaceAll("[a-z_0-9]+([-+.][a-z_0-9]+)*@[a-z_0-9]+([-.][a-z_0-9]+)*\\.[a-z_0-9]+([-.][a-z_0-9]+)*",
				"<a href=\"mailto:$0\">$0</a>"));
	}
}
