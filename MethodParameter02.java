public class MethodParameter02 {
	public static void main(String[] args) {
		B b = new B();
		int[] arr = {1, 2, 3 };
		b.test100(arr);
		System.out.println("main中的 arr 数组值");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		Human p = new Human();
		p.name = "jack";
		p.age = 10;
		b.test200(p);
		System.out.println("main方法中的p.age=" + p.age);
	}
}
class Human {
	String name;
	int age;
}
class B {
	public void test200(Human p) {
		p.age = 10000;
	}
	public void test100(int[] arr) {
		arr[0] = 200;
		System.out.println("test100中的 arr 数组值");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}