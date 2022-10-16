package Collection;

class Employee
{
	@Override
	protected void finalize()
	{
		// TODO Auto-generated method stub
		System.out.println("Cleaning Object");
	}
}

public class Test6
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Employee employee = new Employee();

		employee = null; // Garbage Object

		System.gc(); // Calling Garbage Collector manually
		Thread.sleep(5000);

	}

}
