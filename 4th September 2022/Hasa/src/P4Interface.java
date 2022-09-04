interface Calc1
{
	void add(int a, int b);
}

interface Calc2
{
	int sub(int a, int b);

}

class MyCalC implements Calc1, Calc2
{
	public void add(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}

	public int sub(int a, int b)
	{
		int c = a - b;
		return c;
	}

}

public class P4Interface
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyCalC c1 = new MyCalC();
		c1.add(10, 20);
		System.out.println(c1.sub(30, 5));

	}

}
