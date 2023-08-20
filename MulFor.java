import java.util.Scanner;
public class MulFor {
	public static void main(String []agrs) {
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0;
		int stuNum = 5;
		int claNum = 4;
		for (int i = 1;i <= claNum;i++) {
			double sum = 0;
			for (int j = 1;j <= stuNum;j++) {
				System.out.println("请输入第" + i +"个班的第"+ j + "个学生的成绩");
				double score = myScanner.nextDouble();
				if (score >= 60) {
					passNum++;
				}
				sum += score;
				System.out.println("成绩=" + score);
			}
			System.out.println("sum=" + sum + "平均分=" + (sum/stuNum));
			totalScore += sum;
		}
		System.out.println("三个班的总分=" + totalScore + "三个班的平均分=" + totalScore/(claNum * stuNum));
		System.out.println("及格人数=" + passNum);
	}
}