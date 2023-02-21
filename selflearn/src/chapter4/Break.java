package chapter4;

public class Break {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for (i = 1; i <= 1000; i++) {
			sum += i;
			if( sum > 10000) {
				break;
			}
		}
	System.out.println("合計値が10000を超えるのは、1～" + i + "を加算したときです。");
	}
}
