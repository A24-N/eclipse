package chapter8;

public class OverrideBasic {

	public static void main(String[] args) {
		var bp = new BusinessPerson5();
		bp.name = "山田太郎";
		bp.age = 20;
		System.out.println(bp.show());
		System.out.println(bp.work());

	}

}
