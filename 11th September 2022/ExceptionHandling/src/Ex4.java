//    WE can have single try and multiple catch in single java file

import java.util.Scanner;

public class Ex4
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("Welcome to Nafati tech Application");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the 1st number to devide");

			int aa = scanner.nextInt();

			System.out.println("Enter the 2nd Number");

			int bb = scanner.nextInt();

			int result = aa / bb; // If here find exception. it will go to Exception catch block. and rest of the
									// line will not execute in try block more

			System.out.println("The result is   " + result);

			System.out.println("Plaease enterr the size of an arraty");
			int size = scanner.nextInt();
			int arr[] = new int[size];

			System.out.println("Enter the element to be addded in array");
			int elem = scanner.nextInt();
			System.out.println("Enter the position at which elem has to be inserted");
			int pos = scanner.nextInt();

			arr[pos] = elem;
		}
		catch (ArithmeticException e)
		{
			System.out.println("oye bruh zero nahi dena tha? Enter non zero number");
		}
		catch (NegativeArraySizeException e)
		{
			System.out.println("are bhai - minus number nahi dena tha. put zero to +ve");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("jitna mention kia ho index utna hi do na bhai. Limits");
		}
		catch (Exception e) // Generic catch block should be last.
		{
			System.out.println("Please give propare input");
		}

		System.out.println("Thank for Using application");

	}

}

// if exception found will to to JVM. 
// JVM will check is there any excption
// If he found genral exception  then jVM will not go spactfic exception catch
