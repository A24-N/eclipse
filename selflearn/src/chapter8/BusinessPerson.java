package chapter8;

public class BusinessPerson extends Person {
	public String work() {
		return String.format("%d歳の%sは、働きます。",getAge(), getName() );
	}

}
