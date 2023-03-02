package chapter7;

import java.util.Scanner;

public class Practice7_2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("数値入力してください。");
			var radius = scanner.nextInt();
			var p = new PCircle(radius);
			System.out.println(p.getArea());
		}
	}

}
