package day3_Q;

public class Prob3_20 {
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 45) -10;
		if (rand >= 30) {
			System.out.println("摂氏：" + rand + "度" + "\n");
			System.out.println("真夏");			
		} else if (rand >= 25 && rand < 30) {
			System.out.println("摂氏：" + rand + "度" + "\n");
			System.out.println("夏日");						
		} else if (rand < 25 && rand >= 0) {
			System.out.println("摂氏：" + rand + "度" + "\n");			
		} else {
			System.out.println("摂氏：" + rand + "度" + "\n");
			System.out.println("真冬");			
		}
	}
}
