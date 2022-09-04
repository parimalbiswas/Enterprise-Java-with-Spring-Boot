import java.util.Scanner;

//abstraction -Hiding the details of implimentation (Bike accelarator || Atm Machines) -> we dont  know how its happening
//1st Way Abstractoct Class
//2nd Way Interface(Java Oracle Example Implimentation)

//Interface - Only Stucture

interface Calculator
{
	void add(); // ByDefault public and Abstract Both

	void sub(); // Behind the seance-> public abstract void sub()
}

class MyCalculator1 implements Calculator // Impliment mean Promise I will give the body of methods
{
	public void add()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 1st number to add");
		int a = scanner.nextInt();
		System.out.println("Please enter 2nd number to add");
		int b = scanner.nextInt();
		int c = a + b;
		System.out.println(c);

	}

	public void sub()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 1st number to add");
		int a = scanner.nextInt();
		System.out.println("Please enter 2nd number to add");
		int b = scanner.nextInt();
		int c = a - b;
		System.out.println(c);
	}
}

class MyCalculator2 implements Calculator // Impliment mean Promise I will give the body of methods
{
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}

	public void sub()
	{
		int a = 50;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}
}

class Cal
{
	public void permit(Calculator ref)
	{
		ref.add();
		ref.sub();
	}

}

public class P2Interface
{

	public static void main(String[] args)
	{
		MyCalculator1 m1 = new MyCalculator1();
		m1.add();
		MyCalculator2 m2 = new MyCalculator2();
		Cal c1 = new Cal();
		c1.permit(m2);
	}

}
