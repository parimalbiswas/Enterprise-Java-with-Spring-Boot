package Collection;

import java.util.Hashtable;

public class Test9_HashTable
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Hashtable ht1 = new Hashtable<>();
		ht1.put(10, "Jaba");
		ht1.put(12, "Lohiy");

//		ht1.put("ABCV", null);
//		ht1.put( null,"ABCV");

//		NULL VALUE NOT ALLOWED IN KEY AS WELL AS IN VALUE ALSO

		System.out.println(ht1);

	}

}
