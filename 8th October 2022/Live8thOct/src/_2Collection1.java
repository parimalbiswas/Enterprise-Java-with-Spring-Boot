import java.util.ArrayList;

public class _2Collection1
{

	public static void main(String[] args)
	{
		ArrayList al1 = new ArrayList();
		al1.add("Parimal");
		al1.add('B');
		al1.add(4);
		al1.add(25.5);

		System.out.println(al1);

		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(50);

		System.out.println(al2);

		al2.addAll(al1);
		System.out.println(al2);

		System.out.println(al2.contains('B'));
		System.out.println(al2.get(4));
		System.out.println(al2.isEmpty());

		Object sizeObject = al2.size();
		System.out.println(sizeObject);

		System.out.println(al2.getClass());

		ArrayList al3 = new ArrayList();
		al3.add(10);
		al3.add("Bengaluru");
		al3.add("India");
		al3.add(20.5);

		System.out.println(al3);

		al3.clear();
		System.out.println(al3);
		System.out.println(al3.isEmpty());

		al3.ensureCapacity(5);
		al3.add(10);
		al3.add("Bengaluru");
		al3.add("India");
		al3.add(20.5);

		al3.add(1, 50);

		System.out.println(al3);
		ArrayList al4 = new ArrayList<>();

		al4.add(100);
		al4.add(300);

		al4.addAll(1, al3);
		// System.out.println(al3.size());
		// al3.trimToSize();
		System.out.println(al4);

	}

}
