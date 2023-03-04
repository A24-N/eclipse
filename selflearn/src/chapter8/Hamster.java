package chapter8;

public class Hamster implements IAnimal {
	private String name;
	
	public Hamster(String name) {
		this.name = name;
	}
	
	@Override
	public void move() {
		System.out.printf("%sはトコトコ歩きます。", this.name);
	}
}
