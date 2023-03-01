package chapter7;

public class PCircle {
	
	public Double radius;
	
//	コンストラクター
	public PCircle(double radius) {
		this.radius = radius;
	}
//	引数無しのコンストラクター
	public PCircle() {
//		this.radius = 1.0; 冗長なため下記の方が望ましい
		this(1);
	}

	public Double getArea() {
		return this.radius * this.radius * Math.PI;
	}

}
