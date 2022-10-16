package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashMap hm1 = new HashMap<>();
		hm1.put(10, "Sachine");
		hm1.put(11, "Kholi");
		hm1.put(10, "Sachine");
		hm1.put(15, "Java");
		hm1.put(16, "Yes");

		System.out.println(hm1);

		Set set = hm1.keySet();
		System.out.println(set);
		System.out.println(set.getClass().getName());

		System.out.println("---------------------------");

		Collection c1 = hm1.values();
		System.out.println(c1);
		System.out.println(c1.getClass().getName());

		System.out.println("---------------------------");

		Set mapSet = hm1.entrySet();
		System.out.println(mapSet);
		System.out.println(mapSet.getClass().getName());

		System.out.println("---------------------------");

		Iterator itr = mapSet.iterator();
		while (itr.hasNext())
		{
			Map.Entry data1 = (Map.Entry) itr.next();
			System.out.println(data1.getKey() + " : " + data1.getValue());
			if (data1.getKey().equals(10))
			{
				data1.setValue("KKKKKKKK");
			}
			// hm1.put(50, "ffffff");
		}
		System.out.println(hm1);

	}

}
