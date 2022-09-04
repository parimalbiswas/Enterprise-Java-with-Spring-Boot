interface Demo1k
{
	void display();

	default void show()
	{
		System.out.println("I am in interface");
	}
}

class Alien implements Demo1k
{
	public void display()
	{
		System.out.println("Implementing Display");
	}

	public void show()
	{
		System.out.println("I have Override in  Child");
	}
}

public class P7Interface
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Demo1k d1 = new Alien();
		d1.display();
		d1.show();

	}

}
