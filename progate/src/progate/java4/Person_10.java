package progate.java4;

public class Person_10 {
	
	public static int count = 0;
	
	public String firstName;
	public String middleName;
	public String lastName;
	public int age;
	public double weight;
	public double height;
	
	Person_10(String firstName, String lastName, int age, double height, double weight) {
		
		Person_10.count ++;
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	Person_10(String firstName, String middleName, String lastName, int age, double height, double weight) {
		
		Person_10.count ++;
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	public String fullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}
	
	public static void printCount() {
    System.out.println("合計" + Person_10.count + "人です");
	}

}