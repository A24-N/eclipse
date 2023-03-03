package chapter8;

public class HideBasic {

	public static void main(String[] args) {
		var bp = new BusinessPerson4();
//		BusinessPerson.birthフィールドの表示
		System.out.println(bp.birth);
//		Person.birthフィールドの表示
		bp.show();

	}

}
