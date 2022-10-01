//DdLock
class Warrior11 implements Runnable
{
	String res1 = new String("Bramhastra");
	String res2 = new String("PasuPastra");
	String res3 = new String("Sarpastra");

	@Override
	public void run()
	{
		try
		{
			String s1 = Thread.currentThread().getName();

			if (s1.equals("Rama"))
			{
				ramaAccqRes();
			}
			else
			{
				ravanAccqRes();
			}
		}
		catch (Exception e)
		{
			System.out.println("Some interupptions");
		}

	}

/////////////////////////////////////////////////////////
	public void ramaAccqRes()
	{
		try
		{
			Thread.sleep(4000);
			synchronized (res1)
			{
				System.out.println("Rama has accquaied Res 1" + res1);
				Thread.sleep(4000);
				synchronized (res2)
				{
					System.out.println("Rama has accquaied Res 2" + res2);
					Thread.sleep(4000);
					synchronized (res3)
					{
						System.out.println("Rama has accquaied Res 3" + res3);
						Thread.sleep(4000);

					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

/////////////////////////////////////////////////////////
	public void ravanAccqRes()
	{
		try
		{
			Thread.sleep(4000);
			synchronized (res3)
			{
				System.out.println("Ravan has accquaied Res 1" + res3);
				Thread.sleep(4000);
				synchronized (res2)
				{
					System.out.println("Ravan has accquaied Res 2" + res2);
					Thread.sleep(4000);
					synchronized (res1)
					{
						System.out.println("Ravan has accquaied Res 3" + res1);
						Thread.sleep(4000);

					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class LaunchDL4
{

	public static void main(String[] args)
	{
		Warrior11 w1 = new Warrior11();

		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w1);

		t1.setName("Rama");
		t2.setName("Ravan");

		t1.start();
		t2.start();

	}

}
