package progate.java4;

public class Person_10 {
	
	public String firstName;
	public String lastName;
	public int age;
	public double weight;
	public double height;
	
	public Person_10(String firstName, String lastName, int age, double height, double weight) {
		
		this.firstName = firstName;
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

}
