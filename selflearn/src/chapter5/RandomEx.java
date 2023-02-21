package chapter5;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextFloat());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt(400) + 100);
		System.out.println(rand.nextLong());
		
		var data = new byte[5];
		rand.nextBytes(data);
		for (var b : data) {
			System.out.print(b + " ");
		}
	}

}
