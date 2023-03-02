package chapter7;

public class ArgsParams {
	public int totalProducts(int initial, int... values) {
		var result = initial;
		for ( var value : values) {
			result += value;
		}
		return result;
	}

}
