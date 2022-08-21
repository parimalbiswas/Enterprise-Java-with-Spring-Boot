//static vs normal
class Demo {
	public static void display1() {
		System.out.println("Static method");
	}

	public void display2() {
		System.out.println("Non Static method");
	}
}

public class Launch4 {

	public static void main(String[] args) {
		Demo.display1(); // Directly access without create object because its static(normal also work
							// both work) ||
							// Directly from class name

//		Array.sort(0)// static method
		Demo d1 = new Demo();
		d1.display1();
		d1.display2();

	}

}
