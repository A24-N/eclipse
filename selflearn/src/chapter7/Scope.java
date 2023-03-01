package chapter7;

public class Scope {
	public String data = "フィールド";
	
	public String show() {
		var data = "ローカル";
		return data;
	}
	
	public String show1() {
//		var data = "ローカル";
		return this.data;
	}

}
