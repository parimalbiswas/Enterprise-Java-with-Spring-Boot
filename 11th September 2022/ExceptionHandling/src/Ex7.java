import java.util.Scanner;

class AlphaEx11
{
	public void divition() throws ArithmeticException
	{

		System.out.println("Welcome to Nafati tech Application");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the 1st number to devide");

		int aa = scanner.nextInt();

		System.out.println("Enter the 2nd Number");

		int bb = scanner.nextInt();

		int result = aa / bb;

		System.out.println("The result is   " + result);

		System.out.println("Thank you for using my applications");

	}
}

class BetaEx11
{
	public void display()
	{
		AlphaEx11 a1 = new AlphaEx11();
		a1.divition();
	}
}

public class Ex7
{

	public static void main(String[] args)
	{
		try
		{
			BetaEx11 b1 = new BetaEx11();
			b1.display();
		}
		catch (Exception e)
		{

			System.out.println("Handling the main method");

		}

	}

}
