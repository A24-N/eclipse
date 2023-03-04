package chapter8_implement;

public class Rectangle implements Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
//	四角形の面積を取得
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	
	

}
