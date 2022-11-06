package com.innerclass;

public class Outer5
{
	int x = 10;
//	static int y = 10;

	class Inner5
	{
		int y = 100;

		public void m1()
		{
			int z = 1000;
			System.out.println("Inside m1");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Main method of oter class");
		new Outer5().new Inner5().m1();

	}
}
