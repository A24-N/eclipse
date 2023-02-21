package chapter5;

import java.math.BigInteger;

public class BigNumber {

	public static void main(String[] args) {
		System.out.println("bigNumber");
		bigNumber();
		System.out.println();
		System.out.println("bigNumber2");
		bigNumber2();
	}
	
	public static void bigNumber() {
		long result = 1;
		for (var i = 1; i < 26; i++) {
			result *= i;
			System.out.println(result);
		}
	}
	
	public static void bigNumber2() {
		var result = BigInteger.valueOf(1);
		for (var i = 1; i < 26; i++) {
			result =result.multiply(BigInteger.valueOf(i));
			System.out.println(result);
		}
	}

}
