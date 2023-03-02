package chapter7;

public class PAverage {
	public double getAverage(double initial, double... values) {
		var sum = initial;
		for (var value : values) {
			sum += value;
		}		
		return sum / (values.length + 1);
	}

}
