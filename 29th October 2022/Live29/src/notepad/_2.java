package notepad;

import java.util.ArrayList;

public class _2
{

	public static void m1(ArrayList<?> al)
	{
		al.add(null);
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		m1(al1);

	}

}
