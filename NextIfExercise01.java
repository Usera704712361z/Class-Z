import java.util.Scanner;
public class NextIfExercise01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		if(month >=4 && month <= 10) {
			System.out.println("请输入年龄");
			int age = myScanner.nextInt();
			if(age >= 18 && age <= 60) {
				System.out.println("票价为60");
			} else if(age > 60) {
				System.out.println("票价为20");
			} else if (age >0 && age <= 18){
				System.out.println("票价为30");
			} else {
				System.out.println("输入有误，请重新输入");
		    }
		} else {
			System.out.println("请输入年龄");
			int age = myScanner.nextInt();
			if(age > 0) {
			if(age >= 18) {
				System.out.println("票价为40");
			} else if (age > 0  && age <= 18){
				System.out.println("票价为20");
			}
		    } else {
		    	System.out.println("输入有误，请重新输入");
		    }
		}
	}
}