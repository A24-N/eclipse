package progate.java5;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private double height;
	private double weight;
	
	public Person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
		this(firstName, lastName, age, height, weight);
		this.middleName = middleName;
	}
	
	public String fullName() {
		if (this.middleName == null) {
			return this.lastName + " " + this.firstName;
		} else {
			return this.lastName + " " + this.middleName + " " + this.lastName;
		}
	}
	
	public void printData() {
		System.out.println("名前は" + fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("身長は" + this.height + "mです");
		System.out.println("体重は" + this.weight + "kgです");
		System.out.println("bmiは" + Math.round(bmi()) + "です");
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void buy(Vehicle vehicle) {
		vehicle.setOwner(this);
	}
	

}
