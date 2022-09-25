//_SingleRunMethod

class Alpha1 extends Thread
{
	// In single run method we can achieve multithreadinng like this
	public void run()
	{
		String t = Thread.currentThread().getName();

		if (t.equals("BANK"))
		{
			banking();
		}
		else if (t.equals("PRINT"))
		{
			printing();
		}
		else if (t.equals("CALCULATE"))
		{
			calculation();
		}

	}

	public void banking()
	{
		System.out.println("Banking Task started");

		for (int i = 0; i < 3; i++)
		{
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Bank......");
		}

		System.out.println("Banking Complete");

	}

	public void printing()
	{
		System.out.println("Printing activity");

		for (int i = 0; i < 3; i++)
		{
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing......");
		}

		System.out.println("Printing Complete");

	}

	public void calculation()
	{
		System.out.println("Calculation");

		for (int i = 0; i < 3; i++)
		{
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Calculation......");
		}

		System.out.println("Calculation Complete");
	}

}

public class L5
{

	public static void main(String[] args)
	{
		Alpha1 alpha1 = new Alpha1();
		Alpha1 alpha2 = new Alpha1();
		Alpha1 alpha3 = new Alpha1();

		alpha1.setName("BANK");
		alpha2.setName("PRINT");
		alpha3.setName("CALCULATE");

		alpha1.start();
		alpha2.start();
		alpha3.start();

	}

}
