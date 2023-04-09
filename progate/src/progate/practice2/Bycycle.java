package progate.practice2;

class Bycycle {
	
	private String name;
	private String color;
	private int distance = 0;
	
	public Bycycle(String name, String color, int distance) {
		this.name = name;
		this.color = color;
		this.distance = distance;
	}
	
	public String getBycycleName() {
		return this.name;
	}
	
	public void printData() {
		System.out.println("【自転車の情報】");
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance +"km");
	}

}
