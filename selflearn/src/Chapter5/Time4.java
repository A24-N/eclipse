package Chapter5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Time4 {

	public static void main(String[] args) {
		System.out.println("timeBetween");
		timeBetween();
		System.out.println();
		System.out.println("timePlus");
		timePlus();
		System.out.println();
		System.out.println("timePlus2");
		timePlus2();
	}
	
	public static void timeBetween() {
		var dt1 = LocalDateTime.of(2022, 2, 10, 21, 41, 59);
		var now = LocalDateTime.now();
		
		var period = Period.between(dt1.toLocalDate(), now.toLocalDate());
		System.out.println("日付の差:" + 
		period.getYears() + "年" + 
		period.getMonths() + "月" +
		period.getDays() + "日間"
		);
		
		var duration = Duration.between(dt1, now);
		System.out.println("時間差：" + 
		duration.toHours() + "時間"
		);
	}
	
	public static void timePlus() {
		var now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.plus(3, ChronoUnit.YEARS));
		System.out.println(now.minus(21, ChronoUnit.DAYS));
		System.out.println(now.plusDays(3));
	}
	
	public static void timePlus2() {
		var now = LocalDateTime.now();
		var period = Period.ofYears(3);
		var duration = Duration.parse("P21DT1H1M1S");
		System.out.println(now);
		System.out.println(now.plus(period));
		System.out.println(now.minus(duration));
		
		
	}

}
