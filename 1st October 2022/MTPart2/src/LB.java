class BathRoom1 implements Runnable
{

	// If u put syncroized multiple thread can not enter same time in methods
	// String buffer is syncronized --> at a tiome one thread camn execute
	// String builder is non syncronized
	@Override
	synchronized public void run()
	{
		// System.out.println(Thread.currentThread().getName());
		try
		{
			System.out.println(Thread.currentThread().getName() + "is enter bath");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + "is using bathroom");

			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + "exit from bath room");

		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class LB
{

	public static void main(String[] args) throws InterruptedException
	{
		BathRoom1 b1 = new BathRoom1();

		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);

		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("TIKTOKERS");

		t1.start();
		// t1.join();
		t2.start();
		// t2.join();
		t3.start();
		// t3.join();

		// everone ussing btheroom at the same time// we have to lock bathroom when one
		// goes bathroom

	}

}
