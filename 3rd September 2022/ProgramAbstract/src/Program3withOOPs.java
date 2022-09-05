import java.util.Scanner;

abstract class Shapes
{
	float area;

	abstract void input();

	abstract void compute();

	void display()
	{
		System.out.println("The Area is" + area);
	}

}

//------------------------------------------------------

class Rectangle1 extends Shapes
{
	float lenth;
	float breath;

	void input()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please Enter Length of Rectangle");
		lenth = scan1.nextFloat();
		System.out.println("Please Enter Breath of Rectangle");
		breath = scan1.nextFloat();
	}

	void compute()
	{
		area = lenth * breath;
	}

}

//------------------------------------------------------
class Square1 extends Shapes
{
	float lenth;

	void input()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please Enter Length of Rectangle");
		lenth = scan1.nextFloat();
	}

	void compute()
	{
		area = lenth * lenth;
	}

}

//------------------------------------------------------

class Circle1 extends Shapes
{
	float radious;
	final float PI = 3.14f;

	void input()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please Enter Length of Circle");
		radious = scan1.nextFloat();

	}

	void compute()
	{
		area = PI * radious * radious;
	}

}

class GeoMetry
{
	void permit(Shapes s1)
	{
		s1.input();
		s1.compute();
		s1.display();
	}
}

//------------------------------------------------------

public class Program3withOOPs
{

	public static void main(String[] args)
	{
		Rectangle1 r11 = new Rectangle1();
		Square1 s11 = new Square1();
		Circle1 c11 = new Circle1();

		GeoMetry g11 = new GeoMetry();
		g11.permit(r11);
		g11.permit(s11);
		g11.permit(c11);

	}

}
