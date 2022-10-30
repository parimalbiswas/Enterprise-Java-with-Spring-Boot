package DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Nt5
{

	public static void main(String[] args)
	{
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zoneId);
		System.out.println(zonedDateTime);

		System.out.println("--------------------");

		ZoneId za1 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime za2 = ZonedDateTime.now(za1);
		System.out.println(za1);
		System.out.println(za2);
	}

}
