package chapter5;

public class Str3 {

	public static void main(String[] args) {
		System.out.println("StrStrip");
		StrStrip();
		System.out.println();
		System.out.println("StrIndex");
		StrIndex();
		System.out.println();
		System.out.println("StrContains");
		StrContains();
	}
	
	public static void StrStrip() {
		var str = "  こんにちわ  ";
		System.out.println(str);
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
	} 
	
	public static void StrIndex() {
		var str = "にわにはにわにわとりがいる";
		System.out.println(str.indexOf("にわ")); //0
		System.out.println(str.indexOf("にも")); //-1
		System.out.println(str.lastIndexOf("にわ")); // 6
		System.out.println(str.indexOf("にわ", 3)); //4
		System.out.println(str.lastIndexOf("にわ", 3)); //0
	}
	
	public static void StrContains() {
		var str = "WINGSプロジェクト";
		
		System.out.println(str.contains("プロ")); //true
		System.out.println(str.startsWith("WINGS")); //true
		System.out.println(str.startsWith("WINGS", 3)); //false
		System.out.println(str.endsWith("クト")); //true
	}

}
