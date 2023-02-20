package Chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Time1 {

	public static void main(String[] args) {
		System.out.println("timeNow");
		timeNow();
		System.out.println();
		System.out.println("timeOf");
		timeOf();
		System.out.println();
		System.out.println("timeParse");
		timeParse();
		System.out.println();
	}
	
	public static void timeNow() {
		System.out.println(LocalDateTime.now());
		System.out.println(OffsetDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
	}
	
	public static void timeOf() {
//		LocalDateTimeの生成
		var ldt1 = LocalDateTime.of(2019, 1, 10, 10, 20, 30, 513);
		var ldt2 = LocalDateTime.of(2019, Month.JUNE, 10, 10, 20, 30, 513);
		System.out.println(ldt1);
		System.out.println(ldt2);
		System.out.println();
		
//		LocalTime/LocalDateの生成
		var ld = LocalDate.of(2022, 2, 14);
		var lt = LocalTime.of(10, 30, 59);
		var ldt3 =LocalDateTime.of(ld, lt);
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt3);
		System.out.println();
		
//		OffsetDateTimeの生成
		var odt = OffsetDateTime.of(2019, 1, 10, 15, 8, 59, 999, ZoneOffset.ofHours(8));
		System.out.println(odt);
		System.out.println();
		
//		OffsetTimeの生成
		var ot = OffsetTime.of(15, 20, 59, 999, ZoneOffset.ofHours(5));
		System.out.println(ot);
		System.out.println();
		
//		ZonedDateTimeの生成
		var zdt = ZonedDateTime.of(2022, 2, 19, 16, 30, 57, 999, ZoneId.of("Asia/Tokyo"));
		System.out.println(zdt);
		System.out.println();
	}
	
	public static void timeParse() {
		System.out.println(LocalDate.parse(
				"2022-02-19", DateTimeFormatter.ISO_DATE));
		System.out.println(LocalDate.parse(
				"2019-005", DateTimeFormatter.ISO_ORDINAL_DATE));
		System.out.println(LocalDate.parse(
				"2023-W01-1", DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println(ZonedDateTime.parse(
				"2022-05-16T10:30:59.000000999+09:00[Asia/Tokyo]",
				DateTimeFormatter.ISO_DATE_TIME));
		
	}

}
