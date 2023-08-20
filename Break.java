import java.util.Scanner;
public class Break {
	public static void main(String []args) {
		int sum = 0;
		for(int i = 1;i <= 100;i++) {
			sum += i;
			if(sum > 20) {
				System.out.println("总和第一次大于20,当前的数为" + i);
				break;
			}
		}
		
		
		Scanner myScanner = new Scanner(System.in);
		String name = " ";
		String passwd = " ";
		int chance = 3;
		for(int j = 1;j <= 3;j++) {
			System.out.println("请输入用户名");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			if("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("成功登录");
				break;
			}
			chance--;
			System.out.println("登录失败还剩" + chance + "次机会");
		}
	}
}