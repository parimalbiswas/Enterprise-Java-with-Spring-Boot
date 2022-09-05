// WITHOUT OOPS USESGES

import java.util.Scanner;

class Rectangle
{
	float lenth;
	float breath;
	float area;

	void input()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please Enter Length of Rectangle");
		lenth = scan1.nextFloat();
		System.out.println("Please Enter Breath of Rectangle");
		breath = scan1.nextFloat();
	}

	void Compute()
	{
		area = lenth * breath;
	}

	void Display()
	{
		System.out.println("Area is Rectangle is" + area);
	}
}

class Square
{
	float lenth;
	float area;

	void input()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please Enter Length of Rectangle");
		lenth = scan1.nextFloat();
	}

	void Compute()
	{
		area = lenth * lenth;
	}

	void Display()
	{
		System.out.println("Area is Square is" + area);
	}
}

class Circle
{
	float radious;

	float area;

	void input()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please Enter Length of Circle");
		radious = scan1.nextFloat();

	}

	void Compute()
	{
		area = 3.14f * radious * radious;
	}

	void Display()
	{
		System.out.println("Area is Circle is" + area);
	}
}

public class Program2
{

	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		Square s1 = new Square();
		Circle c1 = new Circle();

		r1.input();
		r1.Compute();
		r1.Display();

		s1.input();
		s1.Compute();
		s1.Display();

		c1.input();
		c1.Compute();
		c1.Display();
	}

}
