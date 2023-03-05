package chapter9.compare;

public class Person implements Comparable<Person> {
	private String firstNameKana;
	private String lastNameKana;
	
	public Person(String fistNameKana, String lastNameKana) {
		this.firstNameKana = fistNameKana;
		this.lastNameKana = lastNameKana;
	}
	
//	苗字、名前カナで大小判定
	@Override
	public int compareTo(Person o) {
		if (this.lastNameKana.equals(o.lastNameKana)) {
			return this.firstNameKana.compareTo(o.firstNameKana);
		} else {
			return this.lastNameKana.compareTo(o.lastNameKana);
		}
	}
	
	@Override
	public String toString() {
		return this.lastNameKana + " " + this.firstNameKana;
	}

}
