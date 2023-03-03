package chapter8;

import java.util.Date;

public final class Person3 {

	private final String name;
	private final int age;
	private final Date birth;
	
//	コンストラクター
	public Person3(String name, int age, Date birth) {
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	
//	ゲッターメソッド
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
	public Date getBirth() {
		return this.birth;
	}
}
