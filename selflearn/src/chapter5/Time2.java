package chapter5;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Time2 {

	public static void main(String[] args) {
		System.out.println("timeEquals");
		times();
		System.out.println();
		System.out.println("timeGet");
		timeGet();
		System.out.println();
		System.out.println("timeGet2");
		timeGet2();
		System.out.println();
	}
	
	public static void times() {
		var dt1 = LocalDateTime.of(2019, 12, 6, 8, 10, 59);
		var dt2 = LocalDateTime.now();
		
		System.out.println(dt1.equals(dt2));
		System.out.println(dt1.isBefore(dt2));
		System.out.println(dt1.isAfter(dt2));		
	}
	
	public static void timeGet() {
		var now = LocalDateTime.now();
		System.out.println(now.getYear() + "年" + 
		now.getMonthValue() + "月" + 
		now.getDayOfMonth() + "日" +
		now.getDayOfWeek() + "" +
		now.getHour() + "時" +
		now.getMinute() + "分" + 
		now.getSecond() + "秒" + 
		now.getNano() + "ナノ秒");
		
		System.out.println("今は" + now.getMonth() + "今年" + now.getDayOfYear() + "日目です" );
	}
	
	public static void timeGet2() {
		var now = LocalDateTime.now();
		var week = new String[] {
				"日", "月", "火", "水", "木", "金", "土"
				};
		System.out.println(now.get(ChronoField.YEAR) + "年" +
				now.get(ChronoField.MONTH_OF_YEAR) + "月" + 
				now.get(ChronoField.DAY_OF_MONTH) + "日" + 
				"(" + week[now.get(ChronoField.DAY_OF_WEEK) -1] + ")" + 
				now.get(ChronoField.HOUR_OF_DAY) + "時" + 
				now.get(ChronoField.MINUTE_OF_HOUR) + "分" + 
				now.get(ChronoField.SECOND_OF_MINUTE) + "秒" + 
				now.get(ChronoField.NANO_OF_SECOND) + "ナノ秒");		
	}

}
