public class VarParameterDetail {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		TT t1 = new TT();
		t1.f1(arr);
		t1.f2("hello", 1.1, 2.2);
	}
}
class TT {
	public void f1(int... nums) {
		System.out.println("长度 = " + nums.length);
	}
	public void f2(String str,double... nums) {
		System.out.println("字符串 = " + str);
	}
}