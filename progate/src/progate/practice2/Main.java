package progate.practice2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
	Bycycle bycycle1 = new Bycycle("ビアンキ", "緑", 0);
	System.out.println("【自転車の情報】");
	bycycle1.printData();
	System.out.println("-----------------");
	Scanner scanner = new Scanner(System.in);
	System.out.print("走る距離を入力してください：");
	int bycycleDistance = scanner.nextInt();
	bycycle1.run(bycycleDistance);
	System.out.println("=================");
	Car car1 = new Car("フェラーリ","赤", 0);
	System.out.println("【車の情報】");
	car1.printData();
	System.out.println("-----------------");
	System.out.print("走る距離を入力してください：");
	int carDistance = scanner.nextInt();
	car1.run(carDistance);
	System.out.println("-----------------");
	System.out.print("給油する量を入力してください：");
	int carCharge = scanner.nextInt();
	car1.charge(carCharge);
	}
}
