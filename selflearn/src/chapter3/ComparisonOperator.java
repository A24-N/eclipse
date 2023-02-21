package chapter3;

public class ComparisonOperator {

	public static void main(String[] args) {
		var builder1 = new StringBuilder("あいう");
		var builder2 = new StringBuilder("あいう");
		System.out.println(builder1 == builder2);
		System.out.println(builder1.toString() == builder2.toString());
		System.out.println(builder1.equals(builder2));
		System.out.println(builder1.toString().equals(builder2.toString()));
	}

}
