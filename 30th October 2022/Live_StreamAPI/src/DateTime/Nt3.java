package DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Nt3
{
	public static void main(String[] args)
	{
		LocalTime time = LocalTime.now();

		int hh = time.getHour();
		int mm = time.getMinute();
		int ss = time.getSecond();
		int ns = time.getNano();

		System.out.println(hh + "==" + mm + "==" + ss + "==" + ns);

		System.out.println("-----------------------");

		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);

		System.out.println("----------------------");

	}
}
