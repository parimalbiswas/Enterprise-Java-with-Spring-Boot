package DateTime;

import java.time.LocalDateTime;

public class Nt4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);

		System.out.println("----------------------");

		LocalDateTime mydate1 = LocalDateTime.of(1995, 1, 3, 12, 45);
		System.out.println(mydate1);

		System.out.println("After 6 month->" + mydate1.plusMonths(6));
		System.out.println("Before 2 month->" + mydate1.minusMonths(2));

		System.out.println(mydate1);

	}

}
