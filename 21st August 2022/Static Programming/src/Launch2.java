
public class Launch2 {

	static int a, b, c;
//	 If u want to get something get executed even before the main method that code
//	 u can write in static block
//If something U want to get executed when the class is getting loaded
//	Initially we make static block to initialize value to static variables
	static { // It will execute first even before the main method also.
		System.out.println("Static bloack");
		a = 10;
		b = 20;
		c = 30;
	}

	static void display1() {
		System.out.println("Static method display 1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

	int m, n, o;

	{
		// JAVA Block || Initialization Block // Instance Initialization Block ||
		// Non static block
		System.out.println("Non static block");
		m = 100;
		n = 200;
		o = 300;

		a = 100; // from non static block we can access static variable but vice versa not
		b = 100;
		c = 200;

	}

	void display2() {
		System.out.println("Non static method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);

		System.out.println(a); // from non static block we can access static variable but vice versa not
		System.out.println(b);
		System.out.println(c);
	}

	Launch2() {
//		It will Call non static block internally by default
		System.out.println("In constractor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method");
		display1();
		Launch2 launch2 = new Launch2();
		launch2.display2();

	}

}

// When we create Object in main method. Default constructor get call.
//If Default constructor found any non static block in that class.
// It will  call from the constructor.
// First  non static block will run then constructor will run 

//Launch2() call a non-static block internally inside the constructor then the rest of the constructor code executes.--> Written in oracle document
