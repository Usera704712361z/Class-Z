public class ObjectHomeWork07 {
	public static void main (String[] args) {
		Dog dog1 = new Dog();
		dog1.show("smith", "yellow", 4);
	}
}
class Dog {
	String name;
	String color;
	int age;
	public void show(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		System.out.println("dog1的名字 = " + this.name + "  dog1的颜色 = " + this.color + "  dog1的颜色 = " + this.age);
	}
}