public class ObjectHomeWork08 {
	public static void main (String[] args) {
		Circle1 c = new Circle1();
		PassObject po = new PassObject();
		po.printAreas(c, 5);
	}
}
class Circle1 {
	double radius;
//	public Circle() {
//		
//	}
//	public Circle(double radius) {
//		this.radius = radius;
//	}
	public double findArea () {
		return Math.PI * radius * radius;
	}
	public void setRadius (double radius) {
		this.radius = radius;
	}
}
class PassObject {
	public void printAreas(Circle1 c, int times) {
		System.out.println("Radius \t Area");
		for (int i = 1;i <= times; i++) {
			c.setRadius(i);
			System.out.println((double)i + "\t " + c.findArea());
		}
	}
}