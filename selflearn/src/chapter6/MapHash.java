package chapter6;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapHash {

	public static void main(String[] args) {
		mapHash();
		System.out.println();
		System.out.println();
		mapHashIdentity();

	}
	
	public static void mapHash() {
		var map = new HashMap<String, String>(Map.of("Rose", "バラ", "Sunflower", "ひまわり", "Morning Glory", "あさがお"));
//		キー値または要素で検索
		System.out.println(map.containsKey("Rose"));
		System.out.println(map.containsValue("バラ"));
//		中身が空か確認
		System.out.println(map.isEmpty());
//		Key値を表示
		for (var key : map.keySet()) {
			System.out.print(key + ",");
		}
//		要素を表示
		System.out.println();
		for (var value : map.values()) {
			System.out.print(value + ",");
		}
		
		map.replace("Rose", "薔薇");
		map.replace("Sunflower", "ひまわり", "向日葵");
//		キー値と要素を表示
		System.out.println();
		for (var entry : map.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
		}
	}
	
	public static void mapHashIdentity() {
		var key1 = Integer.valueOf(256);
		var key2 = Integer.valueOf(256);
		
		var data = new HashMap<Integer, String>() {
			{
				put(key1, "Hoge");
				put(key2, "Foo");
			}
		};
		
		var data2 = new IdentityHashMap<Integer, String>() {
			{
				put(key1, "Hoge");
				put(key2, "Foo");
			}
		};
		
		System.out.println(data);
		System.out.println(data2);
		
	}

}
