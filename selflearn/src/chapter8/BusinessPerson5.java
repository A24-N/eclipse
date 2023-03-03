package chapter8;

public class BusinessPerson5 extends Person {
	
//	基底クラスの同名のメソッドをオーバーライド(上書き)
	@Override
	public String show() {
		return String.format("会社員の%s(%d歳)です", getName(), getAge());
	}
	
	public String work() {
		return String.format("%d歳の%sは、働きます。",getAge(), getName() );
	}

}
