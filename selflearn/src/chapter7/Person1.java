package chapter7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Person1 {
	public String name;
	public Integer age;
	public LocalDateTime updated;
	
//	コンストラクター
	
	public Person1() {
		this("名無権兵衛", 20);
	}
	
//	初期化ブロック
	{
		this.updated = LocalDateTime.now();
	}
	
//	性/名、誕生日から初期化
	public Person1(String firstName, String lastName, LocalDate birth) {
		this.name = lastName + " " + firstName;
		this.age = Period.between(birth, LocalDate.now()).getYears();
	}
	
//	名前、年齢から初期化
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String show() {
		return String.format("%s（%d歳）です。", this.name, this.age);
	}
	
}
