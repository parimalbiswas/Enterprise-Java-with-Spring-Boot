package DateTime;

import java.time.LocalDate;
import java.time.Period;

public class Nt6
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LocalDate today1 = LocalDate.now();

		LocalDate birthdayDate = LocalDate.of(1995, 07, 12);

		Period period = Period.between(birthdayDate, today1);

		System.out.println("age is %d years %d month %d days");
//		System.out.printf(period.getYears(),period.getMonths(),period.getDays());
//		
//		System.out.printf"age is %d years %d month %d days",period.getYears(),period.getMonths(),period.getDays());
//		

	}

}
