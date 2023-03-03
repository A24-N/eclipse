package chapter8;

public final class Person2 {

	private final String name;
	private final int age;
	
//	コンストラクター
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;

	}
	
//	ゲッターメソッド
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
}
