//import java.util.Scanner;
//
////Custom example example
//class InvalidUserException extends Exception
//{
//
//}
//
//class ATM11
//{
//	private int accountNum = 1111;
//	private int password = 2222;
//	private int acUserInput;
//	private int acUserPassword;
//
//	public void input()
//	{
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter accpimt nujm,ber");
//		acUserInput = scanner.nextInt();
//		System.out.println("Enter passowrd");
//		acUserPassword = scanner.nextInt();
//	}
//
//	public void verify() throws InvalidUserException // InvalidUserException weException can also write
//	{
//		if (accountNum == acUserInput && password == acUserPassword)
//		{
//			System.out.println("Collect Your Cash");
//		}
//		else
//		{
//			InvalidUserException iue = new InvalidUserException();
//			System.out.println("Invalid Credentials");
//			throw iue;
//
////			throw new InvalidUserException("Are you really account owner");
//		}
//	}
//
//}
//
//class Bank11
//{
//	public void initiate() throws InvalidUserException
//	{
//		ATM11 atm = new ATM11();
//		try
//		{
//			atm.input();
//			atm.verify();
//		}
//		catch (InvalidUserException e)
//		{
//			try
//			{
//				System.out.println(e.getMessage());
//				atm.input();
//				atm.verify();
//			}
//			catch (InvalidUserException f)
//			{
//				try
//				{
//					System.out.println(f.getMessage());
//					atm.input();
//					atm.verify();
//				}
//				catch (InvalidUserException g)
//				{
//					System.out.println("Card is block. TATA");
//					System.exit(0);
//				}
//			}
//		}
//	}
//}
//
//public class _2L
//{
//
//	public static void main(String[] args) throws InvalidUserException
//	{
//		Bank11 bank = new Bank11();
//		bank.initiate();
//
//	}
//
//}