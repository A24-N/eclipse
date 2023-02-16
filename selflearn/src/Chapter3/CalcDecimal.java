package Chapter3;

import java.math.BigDecimal;

public class CalcDecimal {

	public static void main(String[] args) {
		System.out.println(Math.floor((0.7 + 0.1) * 10));
		var bd1 = new BigDecimal("0.7");
		var bd2 = new BigDecimal("0.1");
		var bd3 = new BigDecimal("10");
		System.out.println(bd1.add(bd2).multiply(bd3));
	}

}
