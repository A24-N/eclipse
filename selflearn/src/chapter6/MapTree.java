package chapter6;

import java.util.Map;
import java.util.TreeMap;

public class MapTree {

	public static void main(String[] args) {
		var data = new TreeMap<String, String>(Map.of("Rose", "バラ", "Sunflower", "ひまわり", "Morning Glory", "あさがお"));
		
		mapTree(data);
		System.out.println();
		
		mapTreeSort();
		

	}
	
	public static void mapTree(TreeMap<String, String> data) {
//		辞書順に並ぶ
		for (var key : data.keySet()) {
			System.out.print(key + ", ");
		}
		System.out.println();
	}
	
	public static void mapTreeSort() {
//		ソート順を指定したTreeMap
		var data = new TreeMap<String, String>(
				(x, y) -> x.length() - y.length()
		);
		data.put("Rose", "バラ");
		data.put("Sunflower", "ひまわり");
		data.put("Morning Glory", "あさがお");
		System.out.println(data);
	}

}
