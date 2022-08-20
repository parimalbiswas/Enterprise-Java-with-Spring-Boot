class Ali
{
	private int age;
	private String name;
//	windows shift I -> Setter getter shortCart

	public Ali(int age, String name) // no return type and same class name -> its an constractor
	{
		this.age = age;
		this.name = name;
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

public class LaunchEncap4This
{

	public static void main(String[] args)
	{
		Ali aligen = new Ali(10, "GHGD"); // Aligen() mean Constractor
		System.out.println(aligen.getAge());
		System.out.println(aligen.getName());
	}

}
