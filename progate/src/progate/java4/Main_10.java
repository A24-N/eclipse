package progate.java4;

public class Main_10 {
	public static void main(String[] args) {
		Person_10 person = new Person_10("Kate", "Jones", 27, 1.6, 50.0);
		
		System.out.println(person.fullName());
		System.out.println(person.age);
		System.out.println(person.bmi());
	}

}
