public class Method01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(5);
		int returnRes = p1.getSum(20, 30);
		System.out.println("getSum方法的返回值=" + returnRes);
	}
}
class Person {
	public void speak() {
		System.out.println("我是一个好人");
	}
	public void cal01() {
		int sum = 0;
		for(int i = 1;i <= 1000; i++) {
			sum += i;
		}
		System.out.println("cal01的计算结果=" + sum);
	}
	public void cal02(int n) {
		int sum = 0;
		for(int i = 1;i <= n;i++) {
			sum += i;
		}
		System.out.println("cal02的计算结果=" + sum);
	}
	public int getSum(int num1,int num2) {
		int res = num1 + num2;
		return res;
	}
}