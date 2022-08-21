
public class Launch1 {
	// static variables
	static int a, b, c; // In heap area loaded

	// static block
	static { // Its is execute automatically when class load. no need to call
		System.out.println(" In Static Block");
		a = 10;
		b = 20;
		c = 30; // Access from static block
	}

	static void display() {
		System.out.println("In static Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		display();
	}

}
// RUN IT
//  1.Static variables -- Execute 1st in program
//  2.Static block
//  3.static method
