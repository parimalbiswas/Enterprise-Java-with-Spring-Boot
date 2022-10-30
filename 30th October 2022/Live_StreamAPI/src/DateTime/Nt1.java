package DateTime;

import java.sql.Time;

public class Nt1
{

	public static void main(String[] args)
	{
		java.util.Date utDate = new java.util.Date();
		System.out.println(utDate);

		System.out.println("-----------Util------------");

		long hour = utDate.getHours();
		System.out.println(hour);

		long time = utDate.getTime();
		System.out.println(time);

		System.out.println("---------SQL--------------");

		java.sql.Date sqDate = new java.sql.Date(0);
		System.out.println(sqDate);

		Time sqDate1 = new java.sql.Time(time);
		System.out.println(sqDate1);

		System.out.println("---------JODA API--------");

	}

}
