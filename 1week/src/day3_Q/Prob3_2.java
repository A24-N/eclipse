package day3_Q;

public class Prob3_2 {
	public static void main(String[] args) {
		int rand = (int)(Math.random()*10) + 1;
		System.out.println("数値："+ rand);
		if (!(rand == 1)) {
			System.out.println("1ではありません");
		} else {
			System.out.println("1です。");
		}
	}

}
