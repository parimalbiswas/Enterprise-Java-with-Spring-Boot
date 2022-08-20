class Aligen
{
	private int age;
	private String name;

	public void setAge(int x)
	{
		age = x;
	}

	public void setName(String x)
	{
		name = x;
	}

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}
}

public class LaunchEncap2
{

	public static void main(String[] args)
	{
		Aligen aligen = new Aligen();
		aligen.setAge(20);
		aligen.setName("fgvgvgv");
		System.out.println(aligen.getName());
		System.out.println(aligen.getAge());
	}

}
