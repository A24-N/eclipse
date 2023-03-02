package chapter7;

public class ArgsParamsBasic {
	public static void main(String[] args) {
		var v = new ArgsParams();
		System.out.println(v.totalProducts(1, 12, 25, -30));
		System.out.println(v.totalProducts(1, 2, 3, 4, 5, 6));
//		System.out.println(v.totalProducts()); 引数が1つも返されていないためエラー。
	}

}
