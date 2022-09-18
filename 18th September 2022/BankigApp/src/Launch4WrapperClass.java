
public class Launch4WrapperClass
{

	public static void main(String[] args)
	{
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		// Integer i3 = new Integer("ten");

		System.out.println(i1);
		System.out.println(i2);
		// System.out.println(i3); // java.lang.NumberFormatException

		Character c1 = new Character('A');
		System.out.println(c1);
		// Charecter class containes only one

		// Only true is case sensitive in Boolean wrapper Class

		Boolean boolean1 = new Boolean(true);
		System.out.println(boolean1);

		Boolean boolean2 = new Boolean("yes");
		System.out.println(boolean2);

		Boolean boolean3 = new Boolean("no");
		System.out.println(boolean3);

	}

}
