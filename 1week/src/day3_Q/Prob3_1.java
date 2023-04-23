package day3_Q;

public class Prob3_1 {
	public static void main(String[] args) {
		int rand =(int)(Math.random()*10) + 1;
		System.out.println("数字："+ rand);
		if (rand >= 5) {
			System.out.println("5以上です");
		} else {
			System.out.println("4以下です");
		}
	}

}
