public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println(10 / 4);
		System.out.println(10.0 / 4);
		double d = 10 / 4;
		
		
		System.out.println(d);
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % -3);//取模的本质，a % b =  a - a / n * 3 / b * b
		System.out.println(-10 % -3);
		
		int i = 10;
		i++;
		++i;
		System.out.println("i = " + i);
		int j = 8;
		int k = j++;
		System.out.println("k = " + k + '\t' + "j = " + j);
	}
  }