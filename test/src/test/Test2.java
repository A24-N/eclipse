package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		// 出力
		while (A >= 1 && B >= 1) {
			if (A > B) {
				A = A % B;
			} else {
				B = B % A;
			}
		}
		if (A !=0 ) {
			System.out.print(A);
		} else {
			System.out.print(B);
		}
	}
}
