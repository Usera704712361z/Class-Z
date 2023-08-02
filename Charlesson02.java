public class Charlesson02 {
	public static void main (String [] args) {
		//在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		char c1 = 97;
		System.out.println(c1);// a 
		
		char c2 = 'a';
		System.out.println((int)c2);// a 对应的数字
		char c3 = '韩';
		System.out.println((int)c3);// 38889
		 char c4 = 38889;
		 System.out.println(c4);
		 //char 类型可以进行运算，相当于一个整数，因为它都有对应的unicode码
		 System.out.println('a' + 10);// 107
		 
		 char c5 = 'b' + 1;
		 System.out.println((int)c5);
		 System.out.println(c5);
	}
}