package chapter5;

public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.abs(-56));						//絶対値
		System.out.println(Math.min(3, 98));					//最小値
		System.out.println(Math.max(3, 98));					//最大値
		System.out.println(Math.ceil(1233.97));					//切り上げ
		System.out.println(Math.floor(1234.99));				//切り捨て
		System.out.println(Math.round(1233.65));				//四捨五入
		System.out.println(Math.sqrt(4));						//平方根
		System.out.println(Math.cbrt(4));						//立方根
		System.out.println(Math.pow(2,5));						//xのy乗
		System.out.println(Math.sin(Math.toRadians(30)));		//サイン
		System.out.println(Math.cos(Math.toRadians(60)));		//コサイン
		System.out.println(Math.tan(Math.toRadians(45)));		//タンジェント
		System.out.println(Math.log(100));						//自然対数(底eの対数)
		System.out.println(Math.log10(100));					//底10の対数
	}

}
