package chapter7;

public class ScopeBlock {

	public static void main(String[] args) {
		var data = "ローカルスコープ";
		{
//			var data = "ローカルスコープ"; エラー：重複ローカル変数 data
		}
		System.out.println(data);
		
		
//		変数dataを宣言する順序を替えるとエラーは発生しない。
		{
			var data1 = "ブロックスコープ";
			System.out.println(data1);
		}
		
		var data1 = "ローカルスコープ";
		System.out.println(data1);
		
		{
			var data2 = "ブロックスコープ1";
			System.out.println(data2);
		}
		{
			var data2 = "ブロックスコープ2";
			System.out.println(data2);
		}
	}
	
}
