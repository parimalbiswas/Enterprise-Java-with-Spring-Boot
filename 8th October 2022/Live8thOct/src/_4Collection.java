import java.util.ArrayDeque;

public class _4Collection
{

	public static void main(String[] args)
	{
		ArrayDeque adq = new ArrayDeque();

		adq.add(10);
		adq.add(20.5);
		adq.add("Parimal");
		adq.add("Kolkata");

		System.out.println(adq);

		adq.addFirst(100);
		adq.addLast(200);
		adq.add(10);
		System.out.println(adq);
	}

}
