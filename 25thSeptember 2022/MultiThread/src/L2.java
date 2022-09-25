class Demo extends Thread
{
	public void run()
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

		System.out.println("---------------------------");
	}
}

class Demo2 extends Thread
{

	public void run()
	{
		printing();
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

		System.out.println("---------------------------");
	}
}

class Demo3 extends Thread
{
	public void run()
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

public class L2
{

	public static void main(String[] args) throws InterruptedException
	{
		Demo d1 = new Demo();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();

		d1.start(); // start method calling run method internally
		d2.start();
		d3.start();

//		d1.banking();
//		d2.printing();
//		d3.calculate();

	}

}

//How many thread I can create - unlimited with priority
