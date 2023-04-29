package test;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 入力
    long N = sc.nextLong();
    
    // 出力
        if (isPrime(N) == true) {
            	System.out.print("Yes");
            } else {
            	System.out.print("No");
            }
}
	static boolean isPrime(long N) {
	    // 2 以上の整数 N に対し、N が素数であれば true、素数でなければ false を返す関数
	    for (long i = 2; i * i <= N; i++) {
	        if (N % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}