package chapter4;

public class Switch {

	public static void main(String[] args) {
		var rank = "うん";
		
		switch (rank) {
			case "甲":
				System.out.println("大変良いです");
				break;
				
			case "乙":
				System.out.println("良いです");
				break;
				
			case "丙":
				System.out.println("頑張りましょう");
				break;
				
			default:
				System.out.println("???");
				break;
		}
		
		fall();
	}
	
	public static void fall() {
		var drink = "ウイスキー";
		switch (drink) {
			case "日本酒":
			case "ビール":
			case "ワイン":
				System.out.println("醸造酒です");
				break;
			case "ブランデー":
			case "ウイスキー":
				System.out.println("蒸留酒です");
				break;
		}
	}
}
