public class ForceConvertlesson01 {
	public static void main(String [] args) {
		int n1= (int)1.9;// 精度丢失
		System.out.println("n1=" + n1);
		
		int n2 = 2000;
		byte b1 = (byte)n2;//数据溢出
		System.out.println("b1=" + b1);
	}
}