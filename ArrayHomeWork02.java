public class ArrayHomeWork02 {
	public static void main(String []args) {
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("===arr的元素情况===");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n===arr的元素情况（倒序）===");
		for(int i = arr.length - 1;i >= 0;i--) {
			System.out.print(arr[i] + "\t");
		}
		double sum = arr[0];
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("\n" + "max=" + max + "maxIndex=" + maxIndex);
		System.out.println("\n" + "平均值=" +(sum / arr.length));
		int findNum = 8;
		int index = -1;
		for(int i = 0;i < arr.length;i++) {
			if(findNum == arr[i]) {
				System.out.println("找到数" + findNum + "下标=" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("没有找到数" + findNum);
		}
	}
}