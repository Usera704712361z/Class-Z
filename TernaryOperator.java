public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		int result = a < b ? a++ : b--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b" + b);
		
		
//		int a1 =3;
//		int b1 = 8;ß
//		double c = a > b ? a : b;
		
		
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3 ;
		System.out.println ("最大数=" + max2);
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("最大数=" + max);
	}
}