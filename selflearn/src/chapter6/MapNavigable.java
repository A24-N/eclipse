package chapter6;

import java.util.Scanner;
import java.util.TreeMap;

public class MapNavigable {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			var data = new TreeMap<String, String>() {
				{
					put("peak", "高くなる");
					put("peach", "もも");
					put("peace", "1切れ");
					put("piece", "平和");
				}
			};
			
			System.out.println("入力してください。");
			var key = scanner.next();
			
			if (data.containsKey(key)) {
				System.out.println(key + "は" + data.get(key) + "です。");
			} else {
				System.out.print("検索中の単語は");
				System.out.print(data.lowerKey(key) + "または");
				System.out.print(data.higherKey(key));
				System.out.println("ですか？");
			}
		}

	}

}
