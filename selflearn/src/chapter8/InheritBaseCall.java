package chapter8;

public class InheritBaseCall {

	public static void main(String[] args) {
		var ebp = new EliteBusinessPerson();
		ebp.name = "山中健太";
		ebp.age = 21;
		System.out.println(ebp.work());

	}

}
