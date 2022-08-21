
public class Launch2 {

	static int a, b, c;

	static {
		System.out.println("Static bloack");
		a = 10;
		b = 20;
		c = 30;
	}

	static void display() {
		System.out.println("Static method display 1");

	}

	int m, n, o;

	{
		// JAVA Block || Initialization Block
		System.out.println("Non static block");
		m = 100;
		n = 200;
		o = 300;
	}

	void display2() {
		System.out.println("Non static method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method");
		display();
//		Launch2

		// INCOMPLETE-------------------

	}

}
