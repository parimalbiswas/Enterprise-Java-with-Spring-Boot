package com.innerclass;

public class T2
{
	public void m1()
	{
		class InnerT2
		{
			public void sum(int x, int y)
			{
				System.out.println("The sum " + (x + y));
			}
		}

		InnerT2 innerT21 = new InnerT2();
		innerT21.sum(10, 20);

		InnerT2 innerT22 = new InnerT2();
		innerT22.sum(100, 200);

	}

	public static void main(String[] args)
	{
		new T2().m1();
	}
}

//