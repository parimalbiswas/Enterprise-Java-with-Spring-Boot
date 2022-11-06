package com.innerclass;

// Regular Inner Class
public class Outer
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inside Inner Class of instance");
		}
	}

	public void m2()
	{
		System.out.println("Inside Outer Class of instance");
	}

	public static void main(String[] args)
	{
		System.out.println("Main method of oter class");
//		Inner in1 = new Inner(); // error
//		Outer outer = new Outer();
		Outer.Inner inner = new Outer().new Inner();
		inner.m1();

		System.out.println("-----");

		new Outer().new Inner().m1();
	}

}
