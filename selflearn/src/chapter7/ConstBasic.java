package chapter7;

public class ConstBasic {

	public static void main(String[] args) {
		var p = new Person1("山田太郎", 30);
		System.out.println(p.show());
		var p1 = new Person1();
		System.out.println(p1.show());

	}

}
