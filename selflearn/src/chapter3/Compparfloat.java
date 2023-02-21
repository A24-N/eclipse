package chapter3;

import java.math.BigDecimal;

public class Compparfloat {

	public static void main(String[] args) {
		System.out.println(0.2 * 3 == 0.6); //false
		
		var bd1 = new BigDecimal("0.2");
		var bd2 = new BigDecimal("3");
		var bd3 = new BigDecimal("0.6");
		System.out.println(bd1.multiply(bd2).equals(bd3)); /**0 値が大きい場合は1　小さい場合は-1　同じ場合は0を表示する
		equalsメソッドは有効桁数まで判定するので 1 = 1.0 →trueにはならない　**/
		
		final double EPSILON = 0.00001;
		var x  = 0.2 * 3;
		var y = 0.6;
		System.out.println(Math.abs(x - y) < EPSILON); // true
	}
}
