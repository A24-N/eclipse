package chapter8;

public class AccessorBasic {

	public static void main(String[] args) {
		var p = new Person();
		p.setName("山田太郎");
		p.setAge(20);
		System.out.println(p.show());
		p.setAge(-20);

	}

}
