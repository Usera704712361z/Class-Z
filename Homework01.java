public class Homework01 {
	public static void main(String[] args) {
		int n1;
		n1 = 13;
		int n2;
		n2 = 17;
		int n3;
		n3 = n1 + n2;
		System.out.println("n3 = " + n3);
		int n4 = 38;
		int n5 = n4 - n3;
		System.out.println("n5 = " + n5);
		char c1 = '\n';
		char c2 = '\t';
		char c3 = '\r';
		char c4 = '\\';
		char c5 = '1';
		char c6 = '2';
		char c7 = '3';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		String book1= "天龙八部";
		String book2 = "笑傲江湖";
		System.out.println(book1 + book2);
		char c8 = '男';
		char c9 = '女';
		System.out.println(c8+c9);
		double price1 = 123.56;
		double price2 = 100.11;
		System.out.println(price1 + price2);
		String name = "jack";
		int age = 20;
		double score = 80.9;
		char gender = '男';
		String hobby = "打篮球";
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name + "\t"
		+ age + "\t" + score + "\t" + gender + "\t" + hobby);
	}
}