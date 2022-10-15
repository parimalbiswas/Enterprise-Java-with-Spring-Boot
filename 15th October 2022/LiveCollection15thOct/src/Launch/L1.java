package Launch;

import java.util.TreeSet;

public class L1
{

	public static void main(String[] args)
	{
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(26);
		ts.add(75);
		ts.add(255);
		ts.add(175);

		System.out.println(ts);

		System.out.println(ts.higher(25));
		System.out.println(ts.ceiling(25));

		TreeSet<Integer> ts1 = new TreeSet<>();

		ts1.add(35);
		ts1.add(40);
		ts1.add(42);
		ts1.add(20);
		ts1.add(15);
		ts1.add(75);
		ts1.add(5);

		System.out.println(ts1.higher(20));
		System.out.println(ts1.ceiling(30));

		System.out.println(ts1.floor(20));
		System.out.println(ts1.lower(20));

	}

}
