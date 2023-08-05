public class InverseOperator {
	public static void main(String[] args) {
		System.out.println(60 > 20);
		System.out.println(!(60 > 20));
		
		boolean b = (10 > 1) ^ (3 > 5);
		System.out.println("b =" + b);
		
		
//		int x = 5;
//		int y = 5;
//		if((x++ == 6) & ++y == 6) {
//			x = 11;
//		}
//		System.out.println("x =" + x + "y = " + y);
		
		
//		int x = 5;
//		int y = 5;
//		if((x++ == 6) && ++y == 6) {
//			x = 11;
//		}
//		System.out.println("x =" + x + "y = " + y);
		
		
//		int x = 5;
//		int y = 5;
//		if((x++ == 5) || ++y == 5) {
//			x = 11;
//		}
//		System.out.println("x =" + x + "y = " + y);
		
		
		int x = 5;
		int y = 5;
		if((x++ == 5) | ++y == 5) {
			x = 11;
		}
		System.out.println("x =" + x + "y = " + y);
		
		
		boolean x1 = true;
		boolean y1 = false;
		short z = 46;
		if((z++ == 46) && (y1 = true)) z++;
		if((x1 = false) || (++z == 49)) z++;
		System.out.println("z = " + z);
	}
}