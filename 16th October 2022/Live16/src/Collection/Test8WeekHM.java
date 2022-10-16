package Collection;

import java.util.WeakHashMap;

class Temp1
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

public class Test8WeekHM
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WeakHashMap hm1 = new WeakHashMap<>();
		Temp1 t1 = new Temp1();
		hm1.put(t1, "ABC");

		System.out.println(hm1);

		t1 = null;
		System.gc();
		Thread.sleep(5000);

		System.out.println(hm1);
	}

}
