public class Floatlesson01 {
	public static void main (String [] args) {
		float num1 = 1.1f;
		double num2 = 1.1;
		double num3 = 1.1f;
		double num4 = .123;
		double num5 = 5.12e2;
		double num6 = 5.12e-2;
		double num7 = 2.1234567851;
		float num8 = 2.1234567851F;
		double num9 = 2.7;
		double num10 = 8.1/3;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
//		if( num9 == num10) {
//			System.out.println("相等");
//		}
		if(Math.abs(num9 - num10) < 0.000001 ) {
			System.out.println("相等");
		}
			System.out.println(Math.abs(num9 - num10));
	}
}