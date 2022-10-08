class cal22
{
	public int add(int... num) // convert into array
	{
		int sum = 0;
		for (int i : num)
		{
			sum += i;
		}
		return sum;
	}

}

public class _1VarArg
{

	public static void main(String[] args)
	{
		cal22 objCal22 = new cal22();
		int res = objCal22.add(5, 4, 10, 6);
		System.out.println(res);

	}

}
