package chapter7;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
//		Optionalオブジェクトの作成
		var opt1 = Optional.of("サンプル１");
		var opt2 = Optional.ofNullable(null);
		var opt3 = Optional.empty();
		
//		値が存在するか
		System.out.println(opt1.isPresent());
		
//		値が存在する場合は、ラムダ式を実行
		opt1.ifPresent(value -> {
			System.out.println(value);
		});
		
//		opt2の値が存在する場合はそれを、nullの場合は引数値を表示
		System.out.println(opt2.orElse("null値です"));
		
//		opt3の値がnull値の場合はラムダ式を実行
		System.out.println(opt3.orElseGet(() -> {
			return "null値です";
		}));
		
		
	}

}
