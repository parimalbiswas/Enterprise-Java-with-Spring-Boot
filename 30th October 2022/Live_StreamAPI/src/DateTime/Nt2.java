package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Nt2
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		System.out.println("-----------------");

		Month month = LocalDate.now().getMonth();
		System.out.println(month);

		int day = LocalDate.now().getDayOfMonth();
		System.out.println(day);

		int year = LocalDate.now().getYear();
		System.out.println(year);

		System.out.println("--------------");

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();

		System.out.println(dd + "-^-" + mm + "-^-" + yy);

		System.out.println("------------------");

	}

}
