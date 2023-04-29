package test;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 入力
    long N = sc.nextLong();
    // 出力
    for (long i = 1; i * i <= N; i++) {
    	if (N % i == 0) {
    		System.out.println(i);
    		if (i != N / i) System.out.println(N / i);
    	}
    }
  }
}