package Chapter5;

import java.util.regex.Pattern;

public class Reg3 {

	public static void main(String[] args) {
		System.out.println("regLongest");
		regLongest();
		System.out.println();
		System.out.println("regMatcher");
		regMatcher();
		System.out.println();
		System.out.println("regAfter");
		regAfter();
	}
	
	public static void regLongest() {
		var tags ="<p><strong>WINGS</strong>サイト<a herh='index.html'>"
				+ "<img src='wings.jpg /></a></p>";
		var ptn = Pattern.compile("<.+>");
		var match = ptn.matcher(tags);
		
		while (match.find()) {
			System.out.println(match.group());
		}
		System.out.println();
		var ptn2 = Pattern.compile("<.+?>"); //[+?]は最短一致
		var match2 = ptn2.matcher(tags);
		while (match2.find()) {
			System.out.println(match2.group());
		}
	}
	
	public static void regMatcher() {
		var msg = "自宅の電話番号は049-288-5544。携帯番号は080-9994-0465。";
		var ptn = Pattern.compile("(?<area>\\d{2,4})-(?<city>[0-9]{2,4})-(?<local>[0-9]{4})");
		var match = ptn.matcher(msg);
		System.out.println("--------");
		while (match.find()) {
			System.out.println("開始位置：" + match.start());
			System.out.println("終了位置：" + match.end());
			System.out.println("マッチング文字列：" + match.group());
			System.out.println("市外局番：" + match.group("area"));
			System.out.println("市内局番：" + match.group("city"));
			System.out.println("加入者番号：" + match.group("local"));
			System.out.println("--------");
		}
	}
	
	public static void regAfter() {
		var str = "<p>サポートサイト<a href=\"https://www.wings.msn.to/\">https:www.wings.msn.to/</a></p>";
		var ptn1 = Pattern.compile("<a href=\"(.+?)\">\\1</a>");
		var match = ptn1.matcher(str);
		if (match.find()) {
			System.out.println(match.group());
		}
	}

}
