class Plane
{
	public void fly()
	{
		System.out.println("Plance is flying");
	}

	public void takeOff()
	{
		System.out.println("Plane is taking Off");
	}
}

class CargoPlane extends Plane
{
	public void fly() // Overridden Methods
	{
		System.out.println("Cargo pane fly lower Height");
	}

	public void carryGoods()
	{
		System.out.println("Cargo plane carry Goods");
	}
}

class PassengerPlane extends Plane
{
	public void fly() // Overridden Methods
	{
		System.out.println("Cargo pane fly medium Height");
	}

	public void carryPassengers()
	{
		System.out.println("Passengers plane carry Passengers");
	}
}

public class L4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Plane cp = new CargoPlane();
		cp.fly();
		cp.takeOff();
//		cp.carryGoods();// Cigate Exaample Child Parent || Not acsees is Directly Child class
		((CargoPlane) cp).carryGoods(); // Down Casting

		Plane pp = new PassengerPlane();
		cp.fly();
		cp.takeOff();
		
		|| Incompl;ete

	}

}
