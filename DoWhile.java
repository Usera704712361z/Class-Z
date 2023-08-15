import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		int n = 0;
		do {
			System.out.println("i = " + i);
			n += i;
			i++;
		} while (i <= 100);
		System.out.println("n =" + n);
		
		
		int x = 1;
		int count = 0;
		do {
			if (x % 5 == 0 && x % 3 != 0) {
				System.out.println("x = " + x);
				count++;
			}
			x++;
		} while(x <= 200);
		System.out.println("count = " + count);
		
		
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("五连鞭");
			System.out.println("还钱吗？y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("回答是" + answer);
		} while(answer != 'y');
		System.out.println("还钱了");
	}
}