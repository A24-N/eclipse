package chapter9.member;

public class EnumMethod {
	public static void main(String[] args) {
		for (var se: Season.values()) {
			se.show();
		}
	}

}
