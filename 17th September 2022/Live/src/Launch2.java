import java.util.Scanner;

class AlphaEx11
{
	public void divition() throws ArithmeticException // ducking
	{
		try
		{
			System.out.println("Welcome to Nafati tech Application");

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the 1st number to devide");

			int aa = scanner.nextInt();

			System.out.println("Enter the 2nd Number");

			int bb = scanner.nextInt();

			int result = aa / bb;

			System.out.println("The result is   " + result);

		}
		catch (Exception e)
		{
			System.out.println("Exception handeleced devition method ");
			throw e; // after handeleed u throwd it --> Re throwing

			// Caller dont know
		}

		// After throw keyword below line not excecutrd --. If u want to excected below
		// line also u have to write in with finally block
		finally // (use to close the resourse) -- always executed
		{
			// it is always excecuted even after throw exception also. then it will go to
			// caller
			System.out.println("Thank you for using my applications");
		}

	}
}

public class Launch2
{

	public static void main(String[] args)
	{
		System.out.println("Main method connection established");
		try
		{
			AlphaEx11 exObj = new AlphaEx11();
			exObj.divition();
			// Caller dont know class throws
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exeption Handeled in main");
		}

	}

}
