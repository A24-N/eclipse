package chapter5;

import java.time.LocalDateTime;

public class Str2 {

	public static void main(String[] args) {
		System.out.println("StrCompare"); 
		StrCompare();
		System.out.println(); 
		System.out.println("StrEquals"); 
		StrEquals();
		System.out.println(); 
		System.out.println("StrEmpty"); 
		StrEmpty();
		System.out.println(); 
		System.out.println("StrBlank"); 
		StrBlank();
	}
	
	public static void StrCompare() {
		var str = "def";
		var now = LocalDateTime.now();
		var tomorrow = now.plusDays(1);
		System.out.println(str.compareTo("abc")); //3
		System.out.println(str.compareTo("def")); //0
		System.out.println(str.compareTo("xyz")); //-20
		System.out.println(str.compareToIgnoreCase("DEF")); //0		
		System.out.println(now.compareTo(tomorrow)); //-1
	}
	
	public static void StrEquals() {
		var str = "Wings";
		System.out.println(str.equals("WINGS")); //false
		System.out.println(str.equalsIgnoreCase("WINGS")); //true
	}
	
	public static void StrEmpty() {
		var str1 = "";
		var str2 = "いろはに";
		System.out.println(str1.isEmpty()); //false
		System.out.println(str2.isEmpty()); //true
	}
	
	public static void StrBlank() {
		var str1 = "";
		var str2 = "   \n";
		System.out.println(str1.isEmpty()); //true
		System.out.println(str1.isBlank()); //true
		System.out.println(str2.isEmpty()); //false
		System.out.println(str2.isBlank()); //true
	}
}
