public class IfExercise01 {
	public static void main(String[] args) {
		double n1 = 11.3;
		double n2 = 19.8;
		if(n1 > 10 && n2 < 20) {
				System.out.println("两个数之和=" + (n1 + n2));
			}
			System.out.println("");
			
			
		int n3 = 30;
		int n4 = 60;
		int n5 = n3 + n4;
		if(n5 % 3 == 0 && n5 % 5 == 0) {
			System.out.println("和可以被3又能被5整除");
		} else {
			System.out.println("和不能被3和5整除");
		}
		
		
		int year = 2023;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}
}