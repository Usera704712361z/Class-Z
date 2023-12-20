public class MethodParameter01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AB obj = new AB();
		obj.swap(a, b);
		System.out.println("main方法 a=" + a + "\tb" +b);
	}
}
class AB {
	public void swap(int a,int b) {
		System.out.println("\n a和b交换前的值\na=" + a + "\tb=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("\n a和b交换后的值\na=" + a + "\tb=" + b);
	}
}