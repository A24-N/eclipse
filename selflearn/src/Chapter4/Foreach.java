package Chapter4;

public class Foreach {

	public static void main(String[] args) {
		System.out.println("ForeachFor");
		ForeachFor();
		System.out.println();
		System.out.println("Foreach2");
		Foreach2();
		System.out.println();
		for ( var value : args) { //実行の構成より引数設定して、argsの中に値を格納
			System.out.println("こんにちわ、" + value + "さん！");
		}
	}
	
	public static void ForeachFor() {
		var data = new String[] { "うめ", "さくら", "もも" };
		for (var i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void Foreach2() {
		var data2 = new String[] { "うめ", "さくら", "もも" };
		for (var value : data2) { //拡張for命令
			System.out.println(value);
		}
	}
}