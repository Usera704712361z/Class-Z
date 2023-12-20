public class Array01 {
	public static void main(String []args) {
		char[] chars = new char[26];
		for(int i = 0;i < chars.length;i++) {
			chars[i] = (char)('A' + i);
		}
		System.out.println("===chars数组===");
		for(int i = 0;i < chars.length;i++) {
			System.out.print(chars[i] + " ");
		}
		System.out.println("\n");
		//练习1
		
		int[] arr = {4,-1,9,10,23};
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1;i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + "maxIndex=" +maxIndex);
		//练习2
	}
}