package DateTime;

import java.time.Year;

public class Nt7
{

	public static void main(String[] args)
	{
		Integer data = 2010; // Integer.parseInt(args[0]);
		Year year = Year.of(data);

		if (year.isLeap())
		{
			System.out.printf("%d is LeapYear", data);
		}
		else
		{
			System.out.printf("%d is Not LeapYear", data);
		}

	}

}
