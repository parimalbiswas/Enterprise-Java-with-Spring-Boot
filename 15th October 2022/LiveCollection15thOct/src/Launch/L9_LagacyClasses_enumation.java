package Launch;

import java.util.Enumeration;
import java.util.Vector;

public class L9_LagacyClasses_enumation
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Vector vector = new Vector<>();
		vector.add(100);
		vector.add(200);
		vector.add(500);
		vector.add(900);

		// Like Enumoration is Itearator
		Enumeration eee1 = vector.elements();

		while (eee1.hasMoreElements())
		{
			System.out.println(eee1.nextElement());
		}

	}

}
