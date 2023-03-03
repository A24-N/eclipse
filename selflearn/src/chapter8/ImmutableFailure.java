package chapter8;

import java.util.Date;

public class ImmutableFailure {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		var birth = new Date();
		var p = new Person3("山田太郎", 20, birth);
		System.out.println(p.getBirth());
//		インスタンス化に際して渡したオブジェクトを更新(日付を更新)
		birth.setDate(15);
		System.out.println(p.getBirth());

		
		var p2 = new Person3("山田太郎", 20, new Date());
		System.out.println(p2.getBirth());
		var birth2 = p2.getBirth();
//		ゲッター経由で取得したオブジェクトを更新(日付を更新)
		birth2.setDate(15);
		System.out.println(p2.getBirth());
	}
	
	public static void t() {
		
	}

}
