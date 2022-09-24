
public class L1
{

	public static void main(String[] args)
	{
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);

		System.out.println(i1.equals(i2));

		Integer i3 = Integer.valueOf(10);
		Integer i4 = Integer.valueOf("10");

		System.out.println(i1);
		System.out.println(i2);

		System.out.println();

		System.out.println(i3);
		System.out.println(i4);

		Integer x1 = Integer.valueOf(5);
		Double x2 = Double.valueOf(10.5);
		Boolean x3 = Boolean.valueOf("Parimal");
		Character x4 = Character.valueOf('a');

		System.out.println("------------------");
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);

	}

}

//Usages Of Wrapper Classes
//Utility method(Helper method/static methods)
//ValueOf
//XXXValue
//parseXXXX
//toString
