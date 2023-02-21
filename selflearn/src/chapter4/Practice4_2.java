package chapter4;

public class Practice4_2 {

	public static void main(String[] args) {
		System.out.println("①：While命令は前置判定で処理前に判定が行われるので処理が一度も行われない場合がある。"
						 + "do...While命令は後置判定で処理後に判定が行われているので最低一回は処理が行われる。");
		System.out.println("②：");
		TimesTables();
		
	}
	
	public static void TimesTables() { 
		for(var i = 1; i <= 9; i++) {
			for(var j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
	}
}
