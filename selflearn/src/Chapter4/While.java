package Chapter4;

public class While {

	public static void main(String[] args) {
		System.out.println("WhileBasic");
		WhileBasic();
		System.out.println();
		System.out.println("WhileDo");
		WhileDo();
	}
	
	public static void WhileBasic() {
		var i = 1;
		while (i < 6) {
			System.out.println(i + "回目のループです");
			i++;
		}
	}
	
	public static void WhileDo() {
		var l = 1;
		do {
			System.out.println(l + "回目のループです");
			l++;
		} while (l < 6);
	}
}
