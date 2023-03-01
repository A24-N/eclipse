package chapter7;

public class FieldBasic {
	
	public static void main(String[] args) {
		var p1 = new Person();
		p1.name = "山田太郎";
		p1.age = 30;
		
		var p2 = new Person();
		p2.name = "山田花子";
		p2.age = 10;
		
		System.out.printf("%s (%d歳) %1$s \n", p1.name, p1.age);
		System.out.printf("%s (%d歳) \n", p2.name, p2.age);
		
		var p = new Person();
		p.name = "こんにちわ太郎";
		p.age = 55;
		System.out.println(p.show());
		
		p.showvoid();
	}
}
