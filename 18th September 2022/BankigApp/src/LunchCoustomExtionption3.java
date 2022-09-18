import java.util.Scanner;

//RTO Example
class UnderAgeException extends Exception
{
	UnderAgeException(String mesg)
	{
		super(mesg);
	}
}

class OverAgeException extends Exception
{
	OverAgeException(String mesg)
	{
		super(mesg);
	}
}

class LicenceApp
{
	private int age;

	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dear Kindly Enter Your Ege to check Eligibility");
		age = scanner.nextInt();
	}

	public void verify() throws UnderAgeException, OverAgeException
	{
		if (age >= 18 && age <= 60)
		{
			System.out.println("You are Eligable");
		}
		else if (age < 18)
		{
			throw new UnderAgeException("Bachha You can not get it. You KID ");
		}
		else if (age > 60)
		{
			throw new OverAgeException("Dadu!! not get it You are too OLD");
		}
	}
}

class RTO
{
	void initiate()
	{
		LicenceApp lApp = new LicenceApp();
		try
		{
			lApp.input();
			lApp.verify();

		}
		catch (UnderAgeException | OverAgeException ae)
		{
			System.out.println(ae.getMessage());
			try
			{
				lApp.input();
				lApp.verify();
			}
			catch (UnderAgeException | OverAgeException ae2)
			{
				System.out.println(ae2.getMessage());
				System.out.println("Seams Sourspicies");
				System.exit(0);
			}
		}
	}
}

public class LunchCoustomExtionption3
{

	public static void main(String[] args)
	{
		RTO rto = new RTO();
		rto.initiate();
	}

}
