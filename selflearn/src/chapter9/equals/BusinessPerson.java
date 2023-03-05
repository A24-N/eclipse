package chapter9.equals;

public class BusinessPerson extends Person {
	private String department;
	
	public BusinessPerson(String firstName, String lastName, String department) {
		super(firstName, lastName);
		this.department = department;
	}
	
	@Override
	public boolean equals(Object obj) {
//		同一性の判定
		if ( this == obj) {
			return true;
		}
		
//		同値性の判定
		if (obj instanceof BusinessPerson) {
			var bp = (BusinessPerson)obj;
			return super.equals(bp) &&
					this.department.equals(bp.department);
		}
		return false;
	}

}
