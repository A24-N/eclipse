package chapter5;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		System.out.println("arraysExample");
		arraysExample();
		System.out.println();
		System.out.println("arrayShallow");
		arrayShallow();
		System.out.println();
		System.out.println("arrayDeep");
		arrayDeep();
		System.out.println();
	}
	
	public static void arraysExample() {
		var array1 = new String[] { "dog", "cat", "mouse", "fox", "lion" };
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.binarySearch(array1, "mouse"));
		
		var array2 = new String[] { "あ", "い", "う", "え", "お" };
		var array3 = Arrays.copyOf(array2, 2);
		System.out.println(Arrays.toString(array3));
		
		var array4 = Arrays.copyOfRange(array2, 1, 7);
		System.out.println(Arrays.toString(array4));
		
		Arrays.fill(array4, 4, 6, "-");
		System.out.println(Arrays.toString(array4));
	}
	
	public static void arrayShallow() {
		var list1 = new StringBuilder[] {
				new StringBuilder("ドレミファソラ"),
				new StringBuilder("CDEFG"),
				new StringBuilder("ハニホヘト")
		};
		var list2 = Arrays.copyOf(list1, list1.length);
		
		list1[2].append("イロハ");
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
	}
	
	public static void arrayDeep() {
		var list1 = new StringBuilder[] {
				new StringBuilder("ドレミファソラ"),
				new StringBuilder("CDEFG"),
				new StringBuilder("ハニホヘト")
		};
		
		var list2 = new StringBuilder[list1.length];
		for (var i = 0; i < list1.length; i++) {
			list2[i] = new StringBuilder(list1[i].toString());
		}
		list1[2].append("イロハ");
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
	}

}
