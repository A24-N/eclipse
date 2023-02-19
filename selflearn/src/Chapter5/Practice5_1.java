package Chapter5;

public class Practice5_1 {

	public static void main(String[] args) {
		System.out.println("問1");
		Q1();
		System.out.println();
		System.out.println("問2");
		Q2();
	}
	
	public static void Q1() {
		var str = "プログラミング言語";
		System.out.println(str.substring(4, 7));
	}
	
	public static void Q2() {
		var str1 = "鈴木\t太郎\t男\t50歳\t広島県";
		var result = str1.split("\t");
		System.out.println(String.join("&", result));
	}

}
