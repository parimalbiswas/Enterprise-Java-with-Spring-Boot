@FunctionalInterface
interface ComputeLengthOfString
{
	int getLength(String s);

}

public class AnnonimusInnnerClass2
{

	public static void main(String[] args)
	{

		ComputeLengthOfString c1 = new ComputeLengthOfString()
		{

			@Override
			public int getLength(String s)
			{
				int result = s.length();
				return result;
			}
		};
		int len = c1.getLength("Java");
		System.out.println(len);
	}

}
