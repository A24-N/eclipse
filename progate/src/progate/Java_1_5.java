package progate;

public class Java_1_5 {
	
	public static void main (String[] args) {
		String name = fullName("田中","田");
		printData(name, 30);
		printData(fullName("山田","山"),5);
	}
	
	public static void printData(String name,int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
}
