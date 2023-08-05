public class ArithmeticOperatorExercise02 {
	public static void main(String[] args) {
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天 合" + weeks + "星期" + leftdays + "天");
		
		double huaShi = 234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("华氏温度" + huaShi + "对应的摄氏温度=" + sheShi);
	}
}