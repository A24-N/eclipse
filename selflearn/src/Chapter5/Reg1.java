package Chapter5;

import java.util.regex.Pattern;

public class Reg1 {

	public static void main(String[] args) {
		System.out.println("matches");
		matches();
		System.out.println();
		System.out.println("matcher");
		matcher();

	}
	
	public static void matches() {
		var tel = new String[] { "080-0000-0000", "084-0909-1919", "350-0000", "0120-198-0930" };
		var rx = "\\d{2,4}-\\d{2,4}-\\d{4}";
		for (var t : tel) {
			System.out.println(Pattern.matches(rx, t) ? t : "アンマッチ");
//			System.out.println(t.matches(rx) ? t : "アンマッチ"); //上と同じ意味
		}
	}
	
	public static void matcher() {
		var str = "自宅の電話番号は049-288-5544。携帯番号は080-9994-0465。";
		var ptn = Pattern.compile("(\\d{2,4})-([0-9]{2,4})-([0-9]{4})");
		var match = ptn.matcher(str);
		System.out.println("--------");
		while (match.find()) {
			System.out.println("開始位置：" + match.start());
			System.out.println("終了位置：" + match.end());
			System.out.println("マッチング文字列：" + match.group());
			System.out.println("市外局番：" + match.group(1));
			System.out.println("市内局番：" + match.group(2));
			System.out.println("加入者番号：" + match.group(3));
			System.out.println("--------");
		}
	}
	
	
}
