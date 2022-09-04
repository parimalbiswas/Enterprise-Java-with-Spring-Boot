class Demo1
{
	int a, b, c;

	public Demo1()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
	}

	public Demo1(int x, int y)
	{
		c = x + y;
	}

}

class Demo3 extends Demo1
{
	int m, n, o;

	public Demo3()
	{

		m = 10;
		n = 20;
		o = m + n;
	}

	public Demo3(int x, int y)
	{
		// by default call Super non parametarize contractor of Parent class.
		// If u want to call parent parametersed constrator u have to call via
		// super(10,20
		// only
		o = x + y;
	}

	// At least one constractor must have super methods
	// all constractor must not have this method

	public void display()
	{
		System.out.println(c);
		System.out.println(o);
	}
}

public class P1
{

	public static void main(String[] args)
	{
		Demo3 demo3 = new Demo3(10, 20);
		demo3.display();

	}

}
