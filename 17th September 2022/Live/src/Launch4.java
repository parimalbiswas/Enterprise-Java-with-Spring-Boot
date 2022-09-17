//return vs system.exit()

class Beta
{
	void display()
	{
		try
		{
			System.out.println("Display method");
			System.exit(0); // It will dominate the finally block also
			// Finally will not execute in case system.exit
		} finally
		{
			System.out.println("Finally ");
		}
	}
}

public class Launch4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Beta beta = new Beta();
		beta.display();

	}

}
