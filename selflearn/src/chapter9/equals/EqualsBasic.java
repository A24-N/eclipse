package chapter9.equals;

public class EqualsBasic {
	public static void main(String[] args) {
		var p = new Person("太郎", "山田");
		var bp = new BusinessPerson("太郎", "山田", "営業");
		var bp2 = new BusinessPerson("太郎", "山田", "総務");
		System.out.println(p.equals(bp));
		System.out.println(p.equals(p));
		System.out.println(bp.equals(bp2));
	}

}
