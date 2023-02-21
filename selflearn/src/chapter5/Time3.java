package chapter5;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Time3 {

	public static void main(String[] args) {
		System.out.println("timeFormat");
		timeFormat();
		System.out.println();
		System.out.println("timePattern");
		timePattern();
		System.out.println();
		System.out.println("timeFormatLocale");
		timeFormatLocale();
		System.out.println();
		System.out.println("timeJP");
		timeJP();
	}
	
	public static void timeFormat() {
		var dt1 = LocalDateTime.of(2023, 2, 10, 21, 41, 59);
		var dt2 = ZonedDateTime.of(2023, 2, 10, 21, 41, 59, 0, ZoneId.of("Asia/Tokyo"));
		
		System.out.println(dt1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		System.out.println(dt2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		System.out.println(dt1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println(dt2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
	}
	
	public static void timePattern() {
		var dt1 = LocalDateTime.of(2023, 2, 10, 21, 41, 59);
		var dt2 = ZonedDateTime.of(2023, 2, 10, 21, 41, 59, 0, ZoneId.of("Asia/Tokyo"));
		var dt3 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		
		System.out.println(dt1.format(DateTimeFormatter.ofPattern("y.MM.dd H:m:s")));
		System.out.println(dt2.format(DateTimeFormatter.ofPattern("Y年L月d日 (E) a K時m分s秒 (z)")));
		System.out.println(dt3.format(DateTimeFormatter.ofPattern("Y年L月d日 (E) a K時m分s秒 (z)")));
	}
	
	public static void timeFormatLocale() {
		var locale = Locale.JAPAN;
//		var locale = Locale.US;
		var zone = ZoneId.of("Asia/Tokyo");
//		var zone = ZoneId.of("America/Chicago");
		var now = ZonedDateTime.of(LocalDateTime.now(), zone);
		
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(
				FormatStyle.FULL).withLocale(locale)));
		System.out.println(now.format(DateTimeFormatter.ofPattern(
				"Y年L月d日 (E) a K時m分s秒 (z)", locale)));
	}
	
	public static void timeJP() {
		var d = JapaneseDate.of(JapaneseEra.REIWA, 4, 2, 20);
		System.out.println(d);
		var df = DateTimeFormatter.ofPattern("Gyy年MM月dd日");
		System.out.println(d.format(df));
	}
	


}
