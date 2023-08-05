public class ArithmeticOperatorExercise01 {
	public static void main (String [] args) {
		int i = 1;
		i = i++;
			System.out.println(i);


		int i1 = 1;
		++i1;
			System.out.println(i1);
			
		
		int i3 = 10;
		int i4 = 20;
		int i5 = i3++;
			System.out.println("i5=" + i5);
			System.out.println("i4=" + i4);
		i5 = --i4;
			System.out.println("i5=" + i5);
			System.out.println("i4=" + i4);
	} 
}