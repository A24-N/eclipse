package chapter5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;

public class EndOfChapter5 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println("問2");
		q2();
		System.out.println("");
		System.out.println("問3");
		q3(args);
		q3_1();
		System.out.println("");
		System.out.println("問4");
		q4();

	}
	
	public static void q1() {
		var str = "となりのきゃくはよくきゃくくうきゃくだ";
		System.out.println("①：" + str.lastIndexOf("きゃく"));
		
		System.out.println("②：" + String.format("%sの気温は%.2f℃です", "千葉", 17.256));
//		模範解答↓
//		var locale = "千葉";
//		var tmp = 17.256;
//		System.out.println("②：" + String.format("%sの気温は%.2f℃です", locale, tmp));
		
		var str1 = "彼女の名前は花子です。";
		var result1 = str1.split("彼女");
		System.out.println("③：" + String.join("妻", result1));
//		模範解答↓
//		System.out.println("③：" + str1.replace("彼女", "妻"));
		
		var now = LocalDateTime.now();
		var duration = Duration.parse("P5DT6H");
		System.out.println("④：" + now + " → " + now.plus(duration));
		
		var dt1 = LocalDateTime.of(2020, 03, 12, 0, 0, 0);
		var dt2 = LocalDateTime.of(2020, 11, 05, 0, 0, 0);
		var period = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
		System.out.println("⑤：" + period.getMonths() + "ヶ月" + period.getDays() + "日間");
//		模範解答↓
//		var dt1 = LocalDate.of(2020, 03, 12);
//		var dt2 = LocalDate.of(2020, 11, 05);
//		var period = Period.between(dt1, dt2);
//		System.out.println("⑤：" + period.getMonths() + "ヶ月" + period.getDays() + "日間");
	}
	
	public static void q2() {
		System.out.println("①：import java.util.regex.Pattern");
		System.out.println("②：try");
		System.out.println("③：Paths.get");
		System.out.println("④：readLine()");
		System.out.println("⑤：matcher");
		System.out.println("⑥：line");
		System.out.println("⑦：group()");
	}
	
	public static void q3(String[] args) {
		try (var writer = Files.newBufferedWriter(Paths.get
				("C:\\Users\\敦\\Desktop\\Pleiades\\data\\data.dat"),
				Charset.forName("Windows-31J"), 
				StandardOpenOption.APPEND )) {
			writer.write(String.join(",", args));
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void q3_1() {
		try (var reader =Files.newBufferedReader(
				Paths.get("C:\\Users\\敦\\Desktop\\Pleiades\\data\\data.dat"),
				Charset.forName("Windows-31J")
				)) {
			var line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void q4() {
		System.out.println("①：" + Math.pow(6, 3));
		System.out.println("②：" + Math.abs(-15));
		
		var list = new Integer[] {110, 14, 28, 32};
		Arrays.sort(list);
		System.out.println("③：" + Arrays.toString(list));
		
	}

}
