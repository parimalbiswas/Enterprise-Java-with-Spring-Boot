class Demo4 implements Runnable
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

class Demo5 implements Runnable
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

class Demo6 implements Runnable
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

public class L4
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Main thread got the chance first");
		Thread ttt = Thread.currentThread(); // main thread
		System.out.println(ttt.isAlive());

		Demo4 demo4 = new Demo4();
		Demo5 demo5 = new Demo5();
		Demo6 demo6 = new Demo6();

		Thread t1 = new Thread(demo4);
		Thread t2 = new Thread(demo5);
		Thread t3 = new Thread(demo6);

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());

		t1.start(); // .start mean handover to thread sheduller
		t2.start(); // If u dont call start method it will became single threaded
		t3.start(); // Manully we have to call method

		t1.join();// join mean main thre should wait unit complete tis thread
		t2.join(); // join mean main thre should wait unit complete tis thread
		t3.join();// join mean main thre should wait unit complete tis thread

		System.out.println("Main thread completed");

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());

	}

}
