class Jio11 implements Runnable
{

	@Override
	public void run()
	{
		try
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println(i);

			}
			Thread.sleep(3000);

			synchronized (this) // one thread at a time only this part
			{
				for (int i = 0; i < 5; i++)
				{
					System.out.print((char) (i + 65));

				}
			}

			// Thread.sleep(3000);

		}
		catch (Exception e)
		{
			System.out.println("Some interuption");
		}

	}

}

public class LaunchSync2
{

	public static void main(String[] args)
	{
		Jio11 in = new Jio11();
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(in);
		Thread t3 = new Thread(in);

		t1.start();
		t2.start();
		t3.start();

	}

}

//syncronised with static method = class level lock
//syncronised with non static method = Object level lock
