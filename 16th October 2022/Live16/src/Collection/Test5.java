package Collection;

import java.util.IdentityHashMap;

public class Test5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		IdentityHashMap hs1 = new IdentityHashMap<>();

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		hs1.put(i1, "Sachine");
		hs1.put(i2, "Sourav");

		System.out.println(hs1);

	}

}
