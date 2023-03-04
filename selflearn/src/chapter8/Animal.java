package chapter8;

public class Animal {
	private String name;
	private int age;
	
//	コンストラクター
	public Animal() {
		this("名無権兵衛", 0);
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	アクセサリーメソッド
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
//	メソッド
	public String intro() {
		return String.format("私の名前は%s。%d歳です。", getName(), getAge());
	}

}
