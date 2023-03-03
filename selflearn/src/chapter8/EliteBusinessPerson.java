package chapter8;

public class EliteBusinessPerson extends BusinessPerson {
	@Override
	public String work() {
		var result = super.work();
		return String.format("%sいつでもてきぱきと", result);
	}

}
