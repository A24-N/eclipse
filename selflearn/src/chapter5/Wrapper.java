package chapter5;

public class Wrapper {

	public static void main(String[] args) {
		System.out.println("AutoBoxing");
		AutoBoxing();
		System.out.println();
		System.out.println("ConvertNumber");
		ConvertNumber();
		System.out.println();
		System.out.println("ConmvertString");
		ConmvertString();
	}
	
	public static void AutoBoxing() {
//		Longはlongの間違い
		Long result = 0L;
		
//		1~10000の総和を求める
		for (var i = 1; i < 10000; i++) {
			result += i;
		}
		System.out.println(result);
	}
	
	public static void ConvertNumber() {
		System.out.println(Integer.parseInt("108"));
		System.out.println(Double.parseDouble("1.2345"));
		System.out.println(Integer.parseInt("FF", 16));
		System.out.println(Double.parseDouble("0.653e2"));
	}
	
	public static void ConmvertString() {
		System.out.println(String.valueOf(108));
		System.out.println(Integer.toString(108));
		System.out.println(Double.toString(1.2345));
		System.out.println(Integer.toString(255, 16));
		System.out.println(Integer.toHexString(255));
		
	}

}
