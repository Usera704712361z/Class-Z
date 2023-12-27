public class ObjectHomeWork02 {
	public static void main (String[] args) {
		String[] strs = {"jack", "tom", "mary", "milan"};
		A02 a02 = new A02();
		int Index = a02.find("tom", strs);
		if (Index != -1) {
			System.out.println("查找的index = " + Index);
		} else {
			System.out.println("未找到相应的字符串");
		}
	}
}
class A02 {
	public int find (String findStr, String[] strs) {
		if (strs != null && strs.length > 0) {
			for (int i = 0; i < strs.length; i++) {
				if (findStr.equals(strs[i])) {
					return i;
				}
			}
		}
		return -1;
	}
}