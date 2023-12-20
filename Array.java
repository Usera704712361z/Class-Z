import java.util.Scanner;
public class Array {
	public static void main(String []args) {
		double[] hens = {3,5,1,3.4,2,50};
		double totalWeight = 0;
		for(int i = 0;i < 6;i++) {
			totalWeight += hens[i];
		}
		System.out.println("总体重=" + totalWeight + "平均体重=" + (totalWeight / 6));
		//数组的静态初始化
		
//		double[] scores = new double[5];
//		Scanner myScanner = new Scanner(System.in);
//		for(int i = 0;i < scores.length;i++) {
//			System.out.println("请输入第" + (i+1) +"个元素的值");
//			scores[i] = myScanner.nextDouble();
//		}
//		System.out.println("====数组的元素/情况如下：=====");
//		for(int i = 0;i < scores.length;i++) {
//			System.out.println("第" + (i+1) +"个元素的值=" + scores[i]);
//		}
		//动态初始化1
		
		double scores[];
		scores = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0;i < scores.length;i++) {
			System.out.println("请输入第" + (i+1) + "个元素的值");
			scores[i] = myScanner.nextDouble();
		}
		System.out.println("==数组的元素/情况如下：==");
		for(int i = 0;i < scores.length;i++) {
			System.out.println("第" + (i+1) +"个元素的值=" + scores[i]);
		}
		//动态初始化2
	}
}