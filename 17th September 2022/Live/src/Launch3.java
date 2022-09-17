//finally  vs return

//if return came in try block always come finnally

// Finally can domainate return statement

class Demo
{
	int display()
	{
		try
		{
			System.out.println("display");
			return 10;
			// System.out.println("Display last line");// unreachable
		} finally
		{
			System.out.println("Display last line");
		}

	}
}

public class Launch3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		System.out.println(d1.display());

	}

}
