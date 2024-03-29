package progate.java4;

public class Person_10 {
	
	private static int count = 0;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private double weight;
	private double height;
	private String job;
	
	Person_10(String firstName, String lastName, int age, double height, double weight, String job) {
		
		Person_10.count ++;
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		
	}
	
	Person_10(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
		
		this(firstName, lastName, age, height, weight, job);
		this.middleName = middleName;
		
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String fullName() {
		
		if (this.middleName == null) {
			return this.firstName + " " + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}

	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
		System.out.println("仕事は" + this.job + "です");
	}
	
	public static void printCount() {
    System.out.println("合計" + Person_10.count + "人です");
	}

}
