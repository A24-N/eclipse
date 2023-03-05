package chapter9.equals;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//	名前/苗字ともに等しければ同値とする
	@Override
	public boolean equals(Object obj) {
//		同一性の判定
		if (this == obj) {
			return true;
		}
//		同値性の判定
		if (obj instanceof Person) {
			var p = (Person)obj;
			return this.firstName.equals(p.firstName) &&
					this.lastName.equals(p.lastName);
		}
		return false;
	}


}
