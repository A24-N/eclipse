package chapter9;

public class EnumMethod {

	public static void main(String[] args) {
		for ( var se: Season.values()) {
			System.out.println(se.ordinal() + ":" + se.toString());
		}

	}

}
