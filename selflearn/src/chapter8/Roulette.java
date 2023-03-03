package chapter8;

import java.util.Random;

public class Roulette {
	private int bound;
//	以上先のオブジェクトをフィールドに保持
	private Random random = new Random();
	
	public Roulette(int bound) {
		this.bound = bound;
	}
	
//	必要に応じて処理を委譲
	public int nextInt() {
		return this.random.nextInt(this.bound);
	}

}
