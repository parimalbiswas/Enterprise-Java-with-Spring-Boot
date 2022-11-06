package com.innerclass;

class Outer3
{
	class Inner3
	{
		public void m1()
		{
			System.out.println("Inside m1");
		}
	}

	public void m2()
	{
		System.out.println("Inside m2");
	}
}

public class Test
{
	public static void main(String[] args)
	{
		new Outer3().new Inner3().m1();
	}
}
