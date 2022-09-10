package src;

class Computer
{
	public void config()
	{
		System.out.println("i7 16GB 1TB");
	}
}

//class Laptop extends Computer
//{
//	public void config()
//	{
//		System.out.println("i9 32GB 1TB");
//	}
//}

public class _5Lamda1
{

	public static void main(String[] args)
	{
		// Create class by JVM $1 like _5Lamda1$1, _5Lamda1$2 like that for every
		// annonimous innerclass

		Computer c1 = new Computer()
		{
			public void config()
			{
				System.out.println("i9 32GB 1TB");
			}
		};
		c1.config();

	}

}
