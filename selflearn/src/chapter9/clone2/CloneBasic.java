package chapter9.clone2;

public class CloneBasic {
	public static void main(String[] args) {
		String[] arr = {"こんにちわ", "こにゃにゃちわ"};
		var p1 = new Person("太郎", "山田",arr);
		var p2 = p1.clone();
		System.out.println(p1 == p2);
		System.out.println(p2);
	}

}
