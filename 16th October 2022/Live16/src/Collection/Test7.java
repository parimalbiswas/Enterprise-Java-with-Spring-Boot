package Collection;

import java.util.HashMap;

class Temp
{
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "Temp";
	}

	@Override
	protected void finalize()
	{
		// TODO Auto-generated method stub
		System.out.println("Cleaning");
	}
}

public class Test7
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		HashMap hm1 = new HashMap<>();
		Temp t1 = new Temp();
		hm1.put(t1, "ABC");

		System.out.println(hm1);

		t1 = null;
		System.gc();
		Thread.sleep(5000);

		System.out.println(hm1);

	}

}
