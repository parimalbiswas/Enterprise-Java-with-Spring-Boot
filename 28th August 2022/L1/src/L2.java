class Animal
{

}

class Tiger extends Animal
{

}

class plane1
{
	public Animal fly()
	{
		System.out.println("Plane is flying");
		Animal a1 = new Animal();
		return a1;
	}
}

class cargoPlane1 extends plane1
{
	// Overridden method return type should be same
	// we cannot reduce visibility but we can increase like protected - public
	// Possible not ice versa
	public Tiger fly()
	{
		System.out.println("Cargo Plane is flying Lower Height");

		Tiger t1 = new Tiger();
		return t1;
	}
}

public class L2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
