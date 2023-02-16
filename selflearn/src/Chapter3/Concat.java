package Chapter3;

public class Concat {

//	public static void main(String[] args) {
//		var result = "";
//		for (var i = 0; i < 100000; i++) {
//			result += "いろは";
//		}
//	System.out.println(result);
//	}
	
	public static void main(String[] args) {
		var builder = new StringBuilder();
		for (var i = 0; i < 100000; i++) {
			builder.append("いろは");
		}
	var result = builder.toString();
	System.out.println(result);
	}
}
