package Chapter3;

import java.util.Arrays;

public class Practice3_2 {

	public static void main(String[] args) {
//		問1
		System.out.println("問１");
		var value = "null";
		System.out.println(value == null ? null : value);
		System.out.println("");
		
//		問2
		System.out.println("問2");
		System.out.println("123".equals("123"));	//true
//		System.out.println("123" == 123); 			//エラー
		System.out.println(new StringBuilder("あいう").equals(new StringBuilder("あいう")));	//false
		System.out.println(Arrays.equals(new int[] {1, 2, 3}, new int[] {1, 2, 3}));	//true
	}
}
