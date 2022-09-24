
public class L2
{

	public static void main(String[] args)
	{

		Character c1 = new Character('c');
		char c2 = c1.charValue();
		System.out.println(c2);

		Boolean b1 = new Boolean(false);
		boolean b2 = b1.booleanValue();
		System.out.println(b2);

		System.out.println("------------------");

		int i11 = Integer.parseInt("10");
		System.out.println(i11);

		boolean b11 = Boolean.parseBoolean("TrUe");
		System.out.println(b11);

		short s11 = Short.parseShort("dgd");
		System.out.println(s11);

	}

}
