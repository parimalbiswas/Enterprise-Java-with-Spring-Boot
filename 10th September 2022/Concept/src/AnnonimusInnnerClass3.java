
interface ComputeLengthOfString1
{
	int getLength(String s);

	void display();

}

public class AnnonimusInnnerClass3
{

	public static void main(String[] args)
	{
		// We can create Functional and nonfuynction innerclass also.
		ComputeLengthOfString1 c1 = new ComputeLengthOfString1()
		{

			@Override
			public int getLength(String s)
			{
				int result = s.length();
				return result;
			}

			public void display()
			{
				System.out.println("In Display");
			}

		};
		int len = c1.getLength("Java");
		System.out.println(len);
	}

}
