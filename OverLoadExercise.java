public class OverLoadExercise {
	public static void main (String[] args) {
		Method method =new Method();
//		method.m(10);
//		method.m(10, 20);
//		method.m("Hello World");
		
		System.out.println(method.max(10, 24));
		System.out.println(method.max(10.0, 24.0));
		System.out.println(method.max(10.0, 1.4, 30.0));
	}
}
class Method {
//	public void m(int n) {
//		System.out.println("平方 = " + (n * n));
//	}
//	public void m(int n1, int n2) {
//		System.out.println("相乘 = " + (n1 * n2));
//	}
//	public void m(String str) {
//		System.out.println("字符串 str = " + str);
//	}
	
	
	public int max(int n1,int n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2, double n3) {
		double maxNum = n1 > n2 ? n1 : n2;
		return maxNum > n3 ? maxNum : n3;
	}
}