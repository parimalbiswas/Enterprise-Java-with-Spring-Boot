package com.innerclass;

public class Outer2
{
	class Inner2
	{
		public void m1()
		{
			System.out.println("Inside Inner Class of instance");
		}
	}

	public void m2()
	{
		Inner2 inner2 = new Inner2();
		inner2.m1();
	}

	public static void main(String[] args)
	{
		System.out.println("Main method of oter class");
		Outer2 o2 = new Outer2();
		o2.m2();
	}
}
