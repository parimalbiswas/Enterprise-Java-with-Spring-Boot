import java.util.LinkedList;

public class _3Collection2
{

	public static void main(String[] args)
	{
		LinkedList ll1 = new LinkedList();

		ll1.add(10);
		ll1.add("Parimal");
		ll1.add('M');
		ll1.add("Bengaluru");

		System.out.println(ll1);

		ll1.add(3, 70);

		System.out.println(ll1);

		ll1.addFirst("Jio");
		ll1.addLast(555);

		System.out.println(ll1);

		LinkedList ll2 = new LinkedList();

		ll2.add("India");
		ll2.offer("Bengaluru");
		ll2.add("India");

		System.out.println(ll2);

	}

}
