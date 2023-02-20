package Chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Practice5_3 {

	public static void main(String[] args) {
		System.out.println("問1");
		q1();
		System.out.println();
		System.out.println("問2");
		q2();
	}
	
	public static void q1() {
		var now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.getMonthValue() + "月\t" + now.getMinute() + "分");
	}
	
	public static void q2() {
		var now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.plusDays(20));
//		模範解答↓
		var period = Period.ofDays(20);
		System.out.println("20日後は、" + now.plus(period));
	}

}
