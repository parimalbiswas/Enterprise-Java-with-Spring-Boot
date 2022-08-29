class Demo1
{
	final public void display() // Final method participate in inheritance but can not override
	{
		System.out.println("Parent");
	}
}

class Demo2 extends Demo1
{

}

public class L5
{

	public static void main(String[] args)
	{

		Demo2 d1 = new Demo2();
		d1.display();

		Demo1 d2 = new Demo1();
		d2.display();
		
		|| Invomplete

	}

}
