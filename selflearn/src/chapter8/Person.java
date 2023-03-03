package chapter8;

public class Person {
//	フィールドはprivate扱い
	private String name;
	private int age;
	
//	nameフィールドゲッター
	public String getName() {
		return this.name;
	}
	
//	nameフィールドセッター
	public void setName(String name) {
		this.name = name;
	}
	
//	ageフィールドゲッター
	public int getAge() {
		return this.age;
	}
	
//	nameフィールドセッター
	public void setAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("年齢は整数で指定してください");
		}
		this.age = age;
	}
	
	public String show() {
		return String.format("%s（%d歳）です。", getName(), getAge());
	}
	

}
