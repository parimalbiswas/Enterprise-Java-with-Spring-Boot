//Fail safe and Fail Fast

package Launch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class L8
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		ArrayList aList = new ArrayList<>();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(50);
		aList.add(55);

//		Its fail fast. Its goes to infinite loop

//		for (int i = 0; i < aList.size(); i++)
//		{
//			System.out.println(aList.get(i));
//			aList.add(99);
//
//		}

//		fali fast
		Iterator itr111 = aList.iterator();

		while (itr111.hasNext())
		{
			System.out.println(itr111.next());
			aList.add(99);
		}

		// ------------------------------------------------

//		fail safe

		CopyOnWriteArrayList calCP = new CopyOnWriteArrayList<>();
		calCP.add(100);
		calCP.add(200);
		calCP.add(300);

		Iterator itr222 = calCP.iterator();

		while (itr222.hasNext())
		{
			System.out.println(itr222.next());
			calCP.add(500);
		}
	}

}
