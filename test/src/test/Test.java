package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for(int i = 1; i <= n; i++) {
    	int count = 0;
    	for (int j = 1; j < i; j++) {
        if (i % j == 0) {
        	count++;
        }
      	if (count == 2) break;
      	}
    	if (count == 1) {
    		System.out.println(i);
    	}
    }
  }
}