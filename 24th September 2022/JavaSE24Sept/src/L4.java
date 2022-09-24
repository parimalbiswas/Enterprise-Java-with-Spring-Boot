
public class L4
{

	public static void main(String[] args)
	{
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		System.out.println(x1 == x2);

		Integer x11 = new Integer(10);
		Integer y11 = 10;// in backend Interger.valueOf(10)

		System.out.println(x11 == y11);

		Integer x111 = new Integer(10);
		Integer y111 = x111;// in backend Interger.valueOf(10)

		System.out.println(x111 == y111);

		Integer x1111 = 1000;
		Integer y1111 = 1000;// in backend Interger.valueOf(10)

		System.out.println(x1111 == y1111);

	}

}
