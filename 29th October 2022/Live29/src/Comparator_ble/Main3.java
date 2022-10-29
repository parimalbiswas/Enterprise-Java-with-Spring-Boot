package Comparator_ble;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> al1 = Arrays.asList(2, 8, 3, 1, 0, 5, 6, 2);

		System.out.println(al1);

		System.out.println("------------");

		Collections.sort(al1);
		System.out.println(al1);

		System.out.println("------------");

		Collections.sort(al1, (a, b) -> b - a);
		System.out.println(al1);

		System.out.println("------------");

		Collections.sort(al1);
		Collections.reverse(al1);
		System.out.println(al1);
	}

}
