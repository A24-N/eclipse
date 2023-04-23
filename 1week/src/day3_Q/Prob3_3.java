package day3_Q;

public class Prob3_3 {
	public static void main(String[] args) {
		int rand = (int)(Math.random()*100) + 1;
		System.out.println("数値："+ rand);
		if (rand < 50) {
			System.out.println("50未満です");
		} else {
			System.out.println("50以上です。");
		}
	}

}
