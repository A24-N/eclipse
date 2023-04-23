package day3_Q;

public class Prob3_4 {
	public static void main(String[] args) {
		int rand = (int)(Math.random()*100) + 1;
		System.out.println("数値："+ rand);
		if (rand <= 10 || rand >= 90) {
			System.out.println("10以下,90以上です。");
		} else {
			System.out.println("10以下,90以上,以外です");
		}
	}
}
