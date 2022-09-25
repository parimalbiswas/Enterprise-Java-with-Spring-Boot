
public class L3
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Banking Task started");

		for (int i = 0; i < 3; i++)
		{
			Thread.sleep(3000);
			System.out.println("Bank......");
		}

		System.out.println("Banking Complete");

		System.out.println("---------------------------");

		System.out.println("Printing activity");

		for (int i = 0; i < 3; i++)
		{
			Thread.sleep(3000);
			System.out.println("Printing......");
		}

		System.out.println("Printing Complete");

		System.out.println("---------------------------");

		System.out.println("Calculation");

		for (int i = 0; i < 3; i++)
		{
			Thread.sleep(3000);
			System.out.println("Calculation......");
		}

		System.out.println("Calculation Complete");

		System.out.println("---------------------------");

	}

}
