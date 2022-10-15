package Launch;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class L6
{

	public static void main(String[] args)
	{

		HashSet hs1 = new HashSet<>();
		hs1.add(100);
		hs1.add(50);

		hs1.add(150);
		hs1.add(25);

		System.out.println(hs1);

		if (hs1.contains(50))
		{
			System.out.println("Preset");
		}

		LinkedHashSet lhs1 = new LinkedHashSet<>();

		lhs1.add(100);
		lhs1.add(50);

		lhs1.add(150);
		lhs1.add(25);

		System.out.println(lhs1);

//		to search fast we use hasSet and LinkedHasSet

	}

}
