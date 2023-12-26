public class OverLoad01 {
	public static void main (String[] args) {
		MyCalculator me =new MyCalculator();
		System.out.println(me.calculate(1, 2));
		System.out.println(me.calculate(1.1, 2));
		System.out.println(me.calculate(1, 2.1));
	}
}
class MyCalculator {
	public int calculate(int n1, int n2) {
		System.out.println("calculate(int n1, int n2)被调用");
		return n1 + n2;
	}
	public double calculate(int n1, double n2) {
		System.out.println("calculate(int n1, double n2)");
		return n1 + n2;
	}
	public double calculate(double n2,int n1) {
		System.out.println("calculate(double n2,int n1)");
		return n2 + n1;
	}
	public int calculate(int n1, int n2, int n3) {
		System.out.println("calculate(int n1, int n2, int n3)");
		return n1 + n2 + n3;
	}
}