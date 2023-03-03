package chapter8;

import java.time.LocalDateTime;

public class BusinessPerson4 extends Person4 {
//	基底クラスのフィールドを隠蔽
	public LocalDateTime birth = LocalDateTime.now();
	
	public void show() {
		System.out.println(super.birth);
	}

}
