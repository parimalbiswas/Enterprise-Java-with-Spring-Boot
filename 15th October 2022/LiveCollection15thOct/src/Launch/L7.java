package Launch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class L7
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		List list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list);

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

		System.out.println("__________________________");

		for (Object elem : list)
		{
			System.out.println(elem);
		}

		System.out.println("__________________________");

		LinkedList ll1 = new LinkedList<>();
		ll1.add(100);
		ll1.add(200);
		ll1.add("Java");
		ll1.add(3.5);

		Iterator itr1 = ll1.iterator();

		while (itr1.hasNext())
		{
			Object object = itr1.next();
//			LinkedList linkedList = (LinkedList) object;
		}

		System.out.println("_______List Itarator____________");

		LinkedList ll12 = new LinkedList<>();
		ll12.add(100);
		ll12.add(200);
		ll12.add("Java");
		ll12.add(3.5);

		ListIterator listIterator = ll12.listIterator(ll12.size());

		while (listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}

		System.out.println("_______Decendent Itarator____________");

		LinkedList ll13 = new LinkedList<>();
		ll13.add(100);
		ll13.add(200);
		ll13.add("Java");
		ll13.add(3.5);

		Iterator dIterator = ll13.descendingIterator();

		while (dIterator.hasNext())
		{
			System.out.println(dIterator.next());
		}

	}

}
