package chapter4;

public class For {

	public static void main(String[] args) {
		System.out.println("ForBasic");
		ForBasic();
		System.out.println();
		System.out.println("ForComma");
		ForComma();
		System.out.println();
		System.out.println("ForComma2");
		ForComma2();
		System.out.println();
		System.out.println("ForComma3");
		ForComma3();
	}
	
	public static void ForBasic() {
		for (var i = 1; i < 6; i++) {
			System.out.println(i + "番目のループです");
		}
	}
	
	public static void ForComma() {
		for ( var j = 1; j < 6; System.out.println(j + "番目のループです"), j++);
	}
	
	public static void ForComma2() {
		for ( var j = 1; j < 6; j++, System.out.println(j + "番目のループです"));
	}
	
	public static void ForComma3() {
		for ( int k = 1, l = 1; k < 6; k++, l++) {
				System.out.println(k * l);
		}
	}
}
