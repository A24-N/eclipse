package progate.practice2;

class Car {
	
	private String name;
	private String color;
	private int distance = 0;
	private int fuel = 100;
	
	public Car(String name, String color, int distance) {
		this.name = name;
		this.color = color;
		this.distance = distance;
	}
	
	public String getBycycleName() {
		return this.name;
	}
	
	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance +"km");
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	public void run(int distance) {
		System.out.println( distance + "km走ります");
		if (this.fuel < distance) {
			System.out.println("ガソリンが足りません");
		} else {
			this.distance += distance;
			this.fuel -= distance;
		}
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
	}
	
	public void charge(int fuel) {
		System.out.println(fuel + "L給油します");
		if (fuel < 0) {
			System.out.println("給油できません");
		} else if (fuel + this.fuel >= 100) {
			System.out.println("満タンまで給油します");
			this.fuel = 100;
		} else {
			this.fuel += fuel;
		}
		System.out.println("ガソリン量：" + this.fuel + "L");
	}

}
