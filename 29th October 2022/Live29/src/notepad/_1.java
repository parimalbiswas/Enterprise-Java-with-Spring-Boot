package notepad;

import java.util.ArrayList;

public class _1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList<>();

		al1.add("fg");
		al1.add("yy");
		al1.add("ii");

		al1.add(10);

		String s1 = (String) al1.get(0);
		System.out.println(s1);

		Object s2 = al1.get(1);
		System.out.println(s2);

		Object s3 = al1.get(3);
		System.out.println(s3);

	}

}
