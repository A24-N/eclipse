package chapter9;

import java.util.List;

public class GenericBounded {
	//	List<Parent>型のリストを受け取り、その内容を出力
	public void show(List<? extends Parent> list) {
		for (var p : list) {
			System.out.println(p.getName());
		}
	}
}
