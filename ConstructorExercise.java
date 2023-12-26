public class ConstructorExercise {
	public static void main(String[] args) {
		Person2 p1 =new Person2();
		System.out.println("p1的信息 p1 name =" + p1.name + " " + "p1 age = " + p1.age);
		Person2 p2 =new Person2("scott", 50);
		System.out.println("p2的信息 p2 name =" + p2.name + " " + "p2 age = " + p2.age);
	}
}
class Person2 {
	String name;
	int age;
	public Person2() {
		age = 18;
	}
	public Person2(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}