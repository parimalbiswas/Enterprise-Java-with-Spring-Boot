
//partiaclaly - bi=oth checked and unchaked exception present.\

// finally to close the resourse.

class Demo10
{
	void display() throws ArithmeticException
	{
		System.out.println("Parent Class overridden method");
	}
}

class Demo12 extends Demo10
{
	@Override
	void display()
	{
		System.out.println("overriddening in child");
	}
}

public class Launch5
{

	public static void main(String[] args)
	{
		Demo12 d12 = new Demo12();
		d12.display();

	}

}
