public class RecursionExercise01 {
	public static void main (String [] args) {
		T t = new T();
//		int n = 7;
//		int res = t.Fibonacci(n);
//		if (res != -1) {
//			System.out.println("当n =" + n + "时，对应的斐波那契值为 = " + res);
//		}
//	}
		int day = 9;
		int peachNum = t.peach(day);
		if (peachNum != -1) {
			System.out.println("第" + day + "天有" + peachNum + "个桃子");
		}
	}
}
class T {
//	public int Fibonacci (int n) {
//		if (n >= 1) {
//			if (n == 1 || n == 2) {
//				return 1;
//			} else {
//				return Fibonacci(n - 1) + Fibonacci(n - 2);
//			}
//		} else {
//			System.out.println("要求输入的n >= 1 的整数");
//			return -1;
//		}
//	}
	public int peach (int n) {
		if(n == 10) {
			return 1;
		} else if (n >= 1 && n <= 9) {
			return (peach(n + 1) + 1) * 2;
		} else {
			System.out.println("请输入 1-10");
			return -1;
		}
	}
}