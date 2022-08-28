class Telsoko
{
	public static void display()
	{
		System.out.println("telosko is parent");
	}
}

class Alien extends Telsoko
{
//	Override static method is not possible in java
	public static void display() // not overriding . Its method hiding || Bcz Static method
	{
		System.out.println("Alean is Telosko");
	}
}

public class L3
{

	public static void main(String[] args)
	{
//		Alien a1 = new Alien();
//		a1.display();

		Telsoko o = new Alien();
		o.display();

	}

}
