package chapter9.member;

public enum Season {
//	SPRING(0, "春"),
//	SUMMER(1, "夏"),
//	AUTOMN(2, "秋"),
//	WINTER(4, "冬");
	
//	列挙定数
	SPRING(0, "春") {
		@Override
		public void show() {
			System.out.println("春の桜");
		}
	},
	SUMMER(1, "夏") {
		@Override
		public void show() {
			System.out.println("夏の海");
		}
	},
	AUTOMN(2, "秋") {
		@Override
		public void show() {
			System.out.println("秋の紅葉");
		}
	},
	WINTER(4, "冬") {
		@Override
		public void show() {
			System.out.println("冬の雪");
		}
	};
	
	
//	フィールド宣言
	private int code;
	private String jpName;
	
//	コンストラクター
	private Season(int code, String jpName) {
		this.code = code;
		this.jpName = jpName;
	}
	
//	メソッド
	public int toSeasonValue() {
		return this.code;
	}
	
	@Override
	public String toString() {
		return this.jpName;
	}
	
//	列挙定数が実装すべき機能(抽象メソッド)
	public abstract void show();
}
