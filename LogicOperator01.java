public class LogicOperator01 {
	public static void main(String[] args) {
		int age = 50;
		if((age > 20) && (age < 90)) {
			System.out.println("OK100");
		}
		if((age > 20) & (age < 400)) {
			System.out.println("OK200");
		}
		int a = 4;
		int b = 9;
		if((a < 1) && (++b < 50)) {
			System.out.println("OK300");
		}
		System.out.println("a=" + a + "b=" + b);
		
		
		int age1 = 50;
		if((age1 > 20) || (age1 < 30)) {
			System.out.println("OK300");
		}
		if((age > 20) | (age < 30)) {
			System.out.println("OK400");
		}
		int c = 4;
		int d = 9;
		if((c > 1) || (++d < 50)) {
			System.out.println("OK500");
		}
		System.out.println("c=" + c + "d=" + d);
	}
}