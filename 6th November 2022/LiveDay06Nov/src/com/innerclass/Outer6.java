package com.innerclass;

public class Outer6
{
	int x = 10;

	class Inner6
	{
		int x = 100;

		public void m1()
		{
			int x = 1000;
			System.out.println("Inside m1");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer6.this.x);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Main method of oter class");
		new Outer6().new Inner6().m1();

	}

}
