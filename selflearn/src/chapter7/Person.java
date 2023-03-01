package chapter7;

public class Person {
	public String name;
	public Integer age;
	
	public String show() {
		return String.format("%s（%d歳）です。", this.name, this.age);
	}
	
	public void showvoid() {
		System.out.printf("%s（%d歳）です。", this.name, this.age);
	}
}
