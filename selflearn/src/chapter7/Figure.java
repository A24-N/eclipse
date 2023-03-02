package chapter7;

public class Figure {
	public static double pi = 3.14;
	
	public static double getTriangleArea(double width, double hight) {
		return width * hight / 2;
	}
	
	public static void getCircleArea(double r) {
		System.out.println("円の面積は" + (r * r * pi));
	}

}
