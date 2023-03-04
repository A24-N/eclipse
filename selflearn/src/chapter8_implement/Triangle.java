package chapter8_implement;

public class Triangle implements Shape {
	private double width;
	private double height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
//	三角形の面積を取得
	@Override
	public double getArea() {
		return this.width * this.height /2;
	}

}
