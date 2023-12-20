//二维数组的动态初始化-列数不确定
public class TwoDimensionalArray01 {
	public static void main(String []args) {
		int[][] arr = new int[3][];
		for(int i = 0;i <arr.length;i++) {
			arr[i] = new int[i + 1];
			for(int j = 0;j < arr[i].length;j++) {
				arr[i][j] = i + 1;
			}
		}
		System.out.println("===arr元素===");
		for (int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}