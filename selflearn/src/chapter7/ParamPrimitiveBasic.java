package chapter7;

public class ParamPrimitiveBasic {

	public static void main(String[] args) {
		var num = 2;
		var p = new ParamPrimitive();
		System.out.println(p.update(num));
		System.out.println(num);
		System.out.println();
		
		var data = new int[] {2, 4, 6};
		System.out.println(data[0]);
		System.out.println(p.update2(data)[0]);
		System.out.println(data[0]);
		System.out.println();
		
		System.out.println(data[0]);
		System.out.println(p.update3(data)[0]);
		System.out.println(data[0]);
		

	}

}
