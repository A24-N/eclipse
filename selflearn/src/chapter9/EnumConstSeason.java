package chapter9;

public class EnumConstSeason {
//	式を表す定数群。本来は列挙型として作成する。
//	public final static int SPRING = 0;
//	public final static int SUMMER = 1;
//	public final static int AUTOMN = 2;
//	public final static int WINTER = 3;

	public static void main(String[] args) {
		var es = new EnumConstSeason();
		es.processSeason(Season.AUTUMN);
//		es.processSeason(4); エラー
	}
	
	public void processSeason(Season season) {
		System.out.println(season);
	}
	
	
	

}
