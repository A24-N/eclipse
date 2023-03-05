package chapter9.clone;

public class Person implements Cloneable {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastname) {
		this.firstName = firstName;
		this.lastName = lastname;
	}
	
	@Override
	public Person clone() {
		Person p = null;
		try {
			p = (Person)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
		return p;
	}
	
	@Override
	public String toString() {
		return this.lastName + firstName;
	}

}
