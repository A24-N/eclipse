package chapter8;

public abstract class Shape {
	protected double width;
	protected double height;
	
	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}
//	図形の面積を取得(派生クラスでオーバーライドするので、中身はダミー)
	public abstract double getArea(); //修飾子abstractにより抽象メソッド化

}
