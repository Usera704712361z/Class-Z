public class ObjectHomeWork04 {
	public static void main(String[] args) {
		int[] oldArr = {10,20,30};
		A03 a03 = new A03();
		int[] arr = a03.copyArr(oldArr);
		System.out.println("===新数组的元素情况===");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
class A03 {
	public int[] copyArr(int [] oldArr) {
		int[] newArr = new int[oldArr.length];
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}