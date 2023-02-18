package Chapter4;

public class EndOfChapter4 {

	public static void main(String[] args) {
		System.out.println("問1");
		System.out.println("①：for\n"
				+ "②：args\n"
				+ "③：value\n"
				+ "④：i\n");
		System.out.println("問2");
		Break();
		System.out.println("");
		System.out.println("問3");
		Q3();
		System.out.println("");
		System.out.println("問4");
		Q4();
		System.out.println("");
		System.out.println("問5");
		Q5();

	}
	
	public static void Break() {
		int i = 1;
		int sum = 0;
		
		while (sum < 10000) {
			sum += i;
			i++;
		}
	System.out.println("合計値が10000を超えるのは、1～" + i + "を加算したときです。");
	}
	
	public static void Q3() {
		int sum1 =0;
		for (int i = 100; i < 200; i++) {
			if (i % 2 == 0) {
				continue;
			} else {
				sum1 += i;				
			}
		}
	System.out.println("合計値は" + sum1);
	}
	
	public static void Q4() {
		var language = "Visual Basic";
		
		switch(language) {
		case "Scala":
		case "Kotlin":
		case "Groovy":
			System.out.println("JVM言語");
			break;
		case "C#":
		case "Visual Basic":
		case "F#":
			System.out.println(".NET言語");
			break;
		default:
			System.out.println("不明");
			break;
		}
	}
	
	public static void Q5() {
		var language = "Scala";
		if (language == "Scala" || language == "Kotlin" || language == "Groovy") {
			/** if (language.equals("Scala") ||
					language.equals("Kotlin") ||
					language.equals("Groovy") ||
			 **/
			System.out.println("JVM言語");
		} else if (language == "C#" || language == "Visual Basic" || language == "F#") {
			/** if (language.equals("C#") ||
					language.equals("Visual Basic") ||
					language.equals("F#") ||
			 **/
			System.out.println(".NET言語");
		} else {
			System.out.println("不明");
		}
	}
}
