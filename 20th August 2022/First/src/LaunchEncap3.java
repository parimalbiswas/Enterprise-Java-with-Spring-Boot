class Fan
{
	private int cost;
	private String brand;

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public void setBrand(String brand)
	{
		this.brand = brand; // (Shaddowing Problem- Nameing Conflict) instance variable == Local Variable
	}

	public int getCost()
	{
		return cost;
	}

	public String getBrand()
	{
		return brand;
	}
}

public class LaunchEncap3
{

	public static void main(String[] args)
	{
		Fan f1 = new Fan();
		f1.setBrand("rfrgfdg");
		f1.setCost(2000);
		System.out.println(f1.getBrand());
		System.out.println(f1.getCost());

	}

}
