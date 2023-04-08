package progate.java4;

public class Person_3 {
	
	public String name;
	
	public Person_3(String name) {
		System.out.println("インスタンスが生成されました");
		this.name = name;
	}
	
	public void hello() {
		System.out.println("こんにちは、私は" + this.name + "です");
	}

}
