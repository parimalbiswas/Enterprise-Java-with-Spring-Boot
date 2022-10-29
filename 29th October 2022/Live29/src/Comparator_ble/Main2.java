package Comparator_ble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2
{

	public static void main(String[] args)
	{

		List<StudentCT> al1 = new ArrayList<>();
		al1.add(new StudentCT(21, "nagesh", "Java"));
		al1.add(new StudentCT(20, "Haswani", "JS"));
		al1.add(new StudentCT(18, "Souvik", "BloackChain"));
		al1.add(new StudentCT(28, "Sundari", "C"));

		for (StudentCT elemeCt : al1)
		{
			System.out.println(elemeCt);
		}

		System.out.println("------------------");

		Collections.sort(al1, new StudentCT_Comptr());

		al1.forEach(s -> System.out.println(s));

		System.out.println("-------------------------");

		Collections.sort(al1, (s1, s2) -> s1.age - s2.age);

		for (StudentCT elemeCt : al1)
		{
			System.out.println(elemeCt);
		}

	}

}
