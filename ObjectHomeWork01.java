public class ObjectHomeWork01 {
	public static void main (String[] args) {
		A01 a01 = new A01();
		double [] arr1 = {1.1, 2.2, 3.3, 4.4, 5.5};
		Double res = a01.max(arr1);
		if (res != null ) {
			System.out.println("arr1的最大值 = " + res);
		} else {
			System.out.println("arr的输入有误，数组不能为null，或者{}");
		}
	}
}
class A01 {
	public Double max(double [] arr) {
		if (arr != null && arr.length > 0) {
			double max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
				 max = arr[i];
				}
			}
			return max;
		} else {
			return null;
		}
	}
}