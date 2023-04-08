package progate.java4;

public class Main_10 {
	public static void main(String[] args) {
		Person_10 person1 = new Person_10("Kate", "Jones", 27, 1.6, 50.0, "医者");
		person1.printData();
    Person_10 person2 = new Person_10("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
    person2.printData();
    
    System.out.println("----------------------");
    person1.setJob("獣医");
    System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
    person1.printData();
    }

}
