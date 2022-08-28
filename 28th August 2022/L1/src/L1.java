class plane
{
	public void fly()
	{
		System.out.println("Plane is flying");
	}
}

class cargoPlane extends plane
{
	// Overridden method return type should be same
	// we cannot reduce visibility but we can increase like protected - public
	// Possible not ice versa
	public void fly()
	{
		System.out.println("Cargo Plane is flying Lower Height");
	}
}

public class L1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
