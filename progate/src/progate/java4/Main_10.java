package progate.java4;

public class Main_10 {
	public static void main(String[] args) {
		Person_10 person1 = new Person_10("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();
    Person_10 person2 = new Person_10("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person2.printData();
    Person_10.printCount();
    System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
	}

}
