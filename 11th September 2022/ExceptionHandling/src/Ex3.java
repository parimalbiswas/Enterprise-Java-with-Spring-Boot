//If there is no exception catch block will not executed.

import java.util.Scanner;

public class Ex3
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("Welcome to Divition Performing Application");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the 1st number to devide");

			int aa = scanner.nextInt();

			System.out.println("Enter the 2nd Number");

			int bb = scanner.nextInt();

			int result = aa / bb; // If here find exception. it will go to Exception catch block. and rest of the
									// line will not execute in try block more

			System.out.println("The result is   " + result);
		}
		catch (Exception e) // If there is no exception catch block will not executed.
		{
			System.out.println("zero hatao dessh bachao");
		}
		System.out.println("Thank for Using application");
	}

}

//If in main method try block find exception. 
//it will go to the JVM. 
// JVM will check in code is programmerer handelled the exception in code or npt
// If not hanfeled  it will go to default exception handeler and thorow exception
//------------------------------------------------------------------------------------------
//If you don't handle exception 

//Welcome to Division Performing Application
//Enter the 1st number to decide
//58
//Enter the 2nd Number
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Ex3.main(Ex3.java:19)
