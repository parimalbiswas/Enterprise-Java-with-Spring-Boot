class Alien3
{
	private int age;
	private String name;
//	windows shift I -> Setter getter shortCart

	public Alien3(int age, String name) // no return type and same class name -> its an constractor
	{
//		either super or this Method will  be present any class(ego issue)
		this(); // call constrator of the same class (parametrer basis) --> calling from one
				// same name constactor to
				// another same name constractor.

		// constractor chainning

		this.age = age;
		this.name = name;
	}

	public Alien3() // Constractor Overloading
	{
		age = 23;
		name = "kkkkkkkk";
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

public class LaunchEnc5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Alien3 a1 = new Alien3(10, "dfdfd");
		System.out.println(a1.getAge());
		System.out.println(a1.getName());

		Alien3 a2 = new Alien3(); // JVM will inclulde zero parametrer by defalt contrasctor if programmer will
		// not define any constractor (If programmer define any constractor in class JVM
		// will not create by default)
		System.out.println(a2.getAge());
		System.out.println(a2.getName());
	}

}
