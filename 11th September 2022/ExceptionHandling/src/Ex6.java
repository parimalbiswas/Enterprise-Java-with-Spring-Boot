import java.util.Scanner;

class AlphaEx
{
	public void divition()
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
			System.out.println("Arithmetic exception / zero");
		}

		System.out.println("Thank you for using my applications");

		// If here exception occoured then JVM look is there any exception handeller
		// go to there. if not found then go to BetaEx class
		// If there also not found then gp to main method
		// if there also no found go to default exction handeler
		// Like Channing--> Chain wise check

	}
}

class BetaEx
{
	public void display()
	{
		AlphaEx a1 = new AlphaEx();
		a1.divition();
	}
}

public class Ex6
{

	public static void main(String[] args)
	{
		BetaEx b1 = new BetaEx();
		b1.display();

	}

}

// Whenever exception occoured. exception genarated
//1. I can handel it by try catch block (try catch keyward need)
//2. I can also Duck the excption  (Thows keyward need)
//3. I can Re thoow  the excption (try, catch, throw, Thows, finnlally keyward need)
