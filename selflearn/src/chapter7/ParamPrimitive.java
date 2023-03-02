package chapter7;

public class ParamPrimitive {
	public int update(int num) {
		num *= 10;
		return num;
	}
	
	public int[] update2(int[] data) {
		data[0] = 5;
		return data;
	}
	
	public int[] update3(int[] data) {
		data = new int[] {10, 20, 30};
		return data;
	}

}
