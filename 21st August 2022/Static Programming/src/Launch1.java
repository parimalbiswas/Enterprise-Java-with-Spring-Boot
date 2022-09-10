//Static variable Block Method Can be create
//Static variable can be aceess from everywhere
//But Non static variable can be acces from non static components

public class Launch1 {
	// static variables
	static int a, b, c; // In heap area memory will be created or loaded

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

//Output Of pRogram
//In Static Block
//Main Method
//In static Method
//10
//20
//30

// RUN IT By JVM During the class Loading run the static block and initialize default values in Backend
//  1.Static variables -- Execute 1st in program
//  2.Static block  -- Execute then after in program
//  3.static method  --Execute then after in program
