package Chapter5;

import java.time.LocalDateTime;
import java.util.Locale;

public class Str5 {

	public static void main(String[] args) {
		System.out.println(String.format(
				"%sは%s、%d歳です。", "サクラ", "女の子", 1));
				//サクラは女の子、1歳です。
		
		System.out.println(String.format(
				"名前は%1$s、%3$d歳です。%1$sは、元気です。", "サクラ", "女の子", 1));
				//名前はサクラ、1歳です。サクラは、元気です。
		
		System.out.println(String.format("%.2sです。", "サクラ")); //サクです。
		
		System.out.println(String.format("%.5sです。", "サクラ")); //サクラです。
		
		System.out.println(String.format("%-5sです。", "サクラ")); //サクラ  です。
		
		System.out.println(String.format("10進数 %08d", 12345)); //10進数 00012345
		
		System.out.println(String.format("16進数 %#x", 10)); //16進数 0xa
		
		System.out.println(String.format("小数点数 %.2f", 123.456)); //小数点数 123.46
		
		System.out.println(String.format("指数/小文字 %.2e", 123.456)); //指数/小文字 1.23e+02
		
		System.out.println(String.format("指数/大文字 %.2E", 123.456)); //指数/大文字 1.23E+02
		
		var d = LocalDateTime.now();
		System.out.println(String.format("%tF", d)); //2023-02-19
		
		System.out.println(String.format("%tr", d)); //05:25:16 午後
		
		System.out.println(String.format("%1$tY年 %1$tm月 %1$td日", d)); //2023年 02月 19日
		
		System.out.println(String.format(Locale.GERMAN, "%f", 1234.567)); //1234,567000
		
		System.out.println(String.format(Locale.GERMAN, "%tr", d)); //05:25:16 PM
		
		System.out.printf("%.2sです。\n", "サクラ"); //サクです。
		
	
	}
	
	

}
