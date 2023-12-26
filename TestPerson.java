public class TestPerson {
	public static void main(String[] args) {
		Person3 p1 = new Person3("mary", 20);
		Person3 p2 = new Person3("smith", 20);
		System.out.println("p1和p2比较的结果 = " + p1.compareTo(p2));
	}
}
class Person3 {
	String name;
	int age;
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean compareTo (Person3 p) {
		return this.name.equals(p.name) && this.age == p.age;
	}
}