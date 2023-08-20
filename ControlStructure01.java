 public class ControlStructure01 {
	 public static void main(String []args) {
		 double money = 100000;
		 int count = 0;
		 while (true) {
			 if (money > 50000) {
				 money *= 0.95;
				 count++;
			 } else if (money >= 1000 && money <= 50000) {
				 money -= 1000;
				 count++;
			 } else {
				 break;
			 }
		 }
		 System.out.println("100000元可以过" + count + "个路口");
		 System.out.println("作业1完成");
		 
		 
		 int count1 = 0;
		 for (int i = 1;i <= 100;i++) {
			 if (i % 5 != 0) {
				 count1++;
				 System.out.print(i + " ");
				 if (count1 %5 == 0) {
					 System.out.println();
				 }
			 }
		 }
		 System.out.println("作业2完成");
		 
		 
		 for (char c1 = 'a';c1 <= 'z';c1++) {
			 System.out.print(c1 + " ");
		 }
		 System.out.print("\n");
		 for (char c2 = 'Z';c2 >= 'A';c2--) {
			 System.out.print(c2 + " ");
		 }
		 System.out.println("\n" + "作业3完成");
		 
		 
		 double sum = 0;
		 for (int n = 1;n <= 100;n++) {
			 if (n % 2 != 0) {
				 sum += 1.0/n;
			 } else {
				 sum -= 1.0/n;
			 }
		  }
		 System.out.println("sum = " + sum);
		 System.out.println("作业4完成");
	 }
 }