package com.anotation1;

//it is functional interface
@FunctionalInterface
interface Addition
{
	void add();

//	int add(int a);
}

class Demo
{
	void getInfo()
	{
		System.out.println("Information in parent");
	}
}

class Demo2 extends Demo
{
	@Override
	void getInfo()
	{
		System.out.println("overrideded sussfully");
	}
}

public class An1
{

	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

		Demo2 demo2 = new Demo2();
		demo2.getInfo();

	}

}
