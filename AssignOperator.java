public class AssignOperator {
	public static void main(String[] args) {
		int n1 = 10;
		n1 += 4;
		System.out.println(n1);
		n1 /= 3;
		System.out.println(n1);
		
		byte b = 3;
		b += 2;  //等价 b = (byte)(b + 2);
		System.out.println(b);
	}
}