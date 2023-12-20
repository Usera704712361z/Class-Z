public class MethodExercise02 {
	public static void main(String[] args) {
		Person1 p = new Person1();
		p.name = "milan";
		p.age = 100;
		Mytools1 tools = new Mytools1();
		Person1 p2 =tools.copyPerson1(p);
		System.out.println("p.name =" + p.name + " " + "p.age =" + p.age);
		System.out.println("p2.name =" + p2.name + " " + "p2.age =" + p2.age);
	}
}
class Person1 {
	String name;
	int age;
}
class Mytools1 {
	public Person1 copyPerson1 (Person1 p) {
		Person1 p2 = new Person1();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}