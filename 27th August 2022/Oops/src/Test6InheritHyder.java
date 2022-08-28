class Tel
{
	private String name; // private not participate in inheritance
	private int age;

	Tel()
	{
		System.out.println("parent Class");
	}

}

// Contractor can not participate inheritation

class Alen extends Tel
{
	Alen()
	{
		// Super() -- by default there. control go to parent contractor
		System.out.println("child Class");
	}
}

public class Test6InheritHyder
{

	public static void main(String[] args)
	{
		Alen a = new Alen();
//		a.name = "Parimal";

	}

}

//Contractor Chaining
//this() will call same class contractor
//super() will call parent class contractor