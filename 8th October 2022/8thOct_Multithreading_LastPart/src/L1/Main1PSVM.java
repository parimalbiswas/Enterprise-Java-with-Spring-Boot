package L1;
class Demo1X extends Thread
{
	int total =0;
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			total+=i;
		}
	}
}


public class Main1PSVM
{

	public static void main(String[] args) throws InterruptedException
	{
		Demo1X demo1x = new Demo1X();
		demo1x.start();
		
		Thread.sleep(1);
		
		System.out.println(demo1x.total);

	}

}
