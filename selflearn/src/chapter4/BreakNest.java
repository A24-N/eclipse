package chapter4;

public class BreakNest {

	public static void main(String[] args) {
		System.out.println("BreakNest1");
		BreakNest1();
		System.out.println();
		System.out.println("BreakNest2");
		BreakNest2();
	}
	
	public static void BreakNest1() {
		for (var i = 1; i < 10; i++) {
			for (var j = 1; j < 10; j++) {
				var result = i * j;
				if (result > 50) {
					break;
				}
				System.out.printf(" %2d", result);
			}
			System.out.println();
		}
	}
	
	public static void BreakNest2(){
		limit:
		for (var k = 1; k <10; k++) {
			for (var l = 1; l < 10; l++) {
				var result2 = k * l;
				if (result2 > 50) {
					break limit;
				}
				System.out.printf(" %2d", result2);
			}
			System.out.println();
		}

	}
}
