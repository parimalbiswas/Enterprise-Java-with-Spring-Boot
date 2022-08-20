class AliK
{
	private int age;
	private String name;

	public AliK()
	{
		this(10, "telosko");
	}

	public AliK(int age)
	{
		this();
		this.age = age;
	}

	public AliK(int age, String name)
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

public class LaunchConstractor
{

	public static void main(String[] args)
	{
		AliK a1 = new AliK();

		AliK a2 = new AliK(10);

	}

}
