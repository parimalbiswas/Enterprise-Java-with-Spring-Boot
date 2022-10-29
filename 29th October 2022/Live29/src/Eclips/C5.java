package Eclips;

import java.util.ArrayList;
import java.util.Collections;

public class C5
{
	public static void main(String[] args)
	{

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(5);
		al1.add(15);
		al1.add(20);

		al1.add(10);

		System.out.println(al1);

		Collections.sort(al1);
		System.out.println(al1);
	}
}
