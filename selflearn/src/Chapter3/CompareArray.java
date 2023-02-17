package Chapter3;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		var data1 = new String[] { "あ", "い", "う"};
		var data2 = new String[] { "あ", "い", "う"};
		System.out.println(data1 == data2);      			//false
		System.out.println(data1.equals(data2)); 			//false
		System.out.println(Arrays.equals(data1, data1));	//true
		System.out.println("\n");
		
		var data3 = new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};
		var data4 = new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};
		System.out.println(Arrays.equals(data3, data4));		//false
		System.out.println(Arrays.deepEquals(data3, data4));	//true
		System.out.println("\n");
		
		var data5 = new int[] {1, 3};
		var data6 = new int[] {1, 2, 3};
		var data7 = new int[] {1, 2, 3};
		var data8 = new int[] {1, 3, 2};
		System.out.println(Arrays.compare(data5, data6));	//1
		System.out.println(Arrays.compare(data7, data8));	//-1
		System.out.println(Arrays.compare(data6, data7));	//0
	}

}
