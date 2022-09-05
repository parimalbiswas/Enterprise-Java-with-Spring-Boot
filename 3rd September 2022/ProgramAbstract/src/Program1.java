abstract class Calculator
{
	abstract int add();

	abstract int add(int a, int b);

}

class Cal extends Calculator
{
	public int add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
//		System.out.println(c);
		return c;
	}

	public int add(int a, int b)
	{

		int c = a + b;
//		System.out.println(c);
		return c;
	}

}

public class Program1
{

	public static void main(String[] args)
	{
		Cal c1 = new Cal();
		System.out.println(c1.add(5, 5));
		System.out.println(c1.add());

	}

}
