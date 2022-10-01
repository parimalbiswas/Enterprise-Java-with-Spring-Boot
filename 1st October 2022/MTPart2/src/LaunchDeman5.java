class Check implements Runnable
{
	public void run()
	{
		try
		{
			for (int i = 0; i < 4; i++)
			{
				System.out.println("Java is best" + i);
				Thread.sleep(3000);
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

public class LaunchDeman5
{

	public static void main(String[] args)
	{
		Check c1 = new Check();
		// By default all are are non demon thread where its created by jvm or by me
		Thread t = Thread.currentThread();

		System.out.println(t.isDaemon());
		// t1.setDaemon(true); // I can not true main thread is demon
		// System.out.println(t1.isDaemon());

		Thread t1 = new Thread(c1);
		System.out.println(t1.isDaemon());
		t1.start();
		t1.setDaemon(true);

		System.out.println(t1.isDaemon());

	}

}

//Garbage collector is Dmon Thread