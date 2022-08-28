class A
{
	int i = 5;

	public void show()
	{
		System.out.println("In A show");
	}
}

class B extends A
{
	int i = 7;
}

public class Task2
{

	public static void main(String[] args)
	{
		B obj = new B();
		obj.show();
		System.out.println(obj.i);

	}

}
