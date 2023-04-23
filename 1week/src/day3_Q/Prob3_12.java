package day3_Q;

public class Prob3_12 {
	public static void main(String[] args) {
		int rand = (int)(Math.random()* 20) - 10;
		System.out.println("数値："+ rand);
		if (rand < 0) {
			System.out.println("負の");
		} else if (rand == 0) {
			System.out.println("0です");
		} else {
			System.out.println("正");
		}
	}
}
