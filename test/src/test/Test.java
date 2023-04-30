package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		long N = sc.nextLong();
		// 出力
		for (long i = 2; i * i <= N; i++) {
			if (N % i == 0) {
				N /= i;
				System.out.print(i + " ");
				i = 1;
			}
		}
		System.out.println(N);
		
	}
}