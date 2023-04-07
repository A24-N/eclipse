package progate.practice1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("名前：");
		String firstName = scanner.next();
		System.out.print("名字：");
		String lastName = scanner.next();
		System.out.print("年齢：");
		int age = scanner.nextInt();
		System.out.print("身長(m)");
		double height = scanner.nextDouble();
		System.out.print("体重(kg)");
		double weight = scanner.nextDouble();
		String fullName = fullName(firstName, lastName);
		printData(fullName, age, height, weight);
		
	}

	public static void printData(String fullName, int age, double height, double weight) {
		System.out.println("名前は" + fullName + "です");
		System.out.println("年齢は" + age + "歳です");
		if (age >= 20) {
			System.out.println("成年者です");
		} else {
			System.out.println("未成年者です");
		}
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "kgです");
	}
	
	private static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

}
