public class Array02 {
	public static void main(String []args) {
		int[] arr = {11, 22, 33, 44, 55, 66}; 
		int temp = 0;
		int len = arr.length;
		for(int i = 0;i <len / 2;i++) {
			temp = arr[len - 1 - i];
			arr[len - 1 - i] = arr[i];
			arr[i] = temp;
		}
		System.out.println("===数组翻转后的值===");
		for(int i = 0;i < len;i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n");
		//方式1
		
		int[] arr1 = {11, 22, 33, 44, 55, 66};
		int[] arr2 = new int[arr1.length];
		for(int i = 5,j = 0;i >= 0;i--,j++) {
			arr2[j] = arr1[i];
		}
		System.out.println("===数组arry1翻转后的值===");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		//方式2
	}
}