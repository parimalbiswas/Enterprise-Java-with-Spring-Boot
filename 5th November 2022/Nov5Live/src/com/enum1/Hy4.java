package com.enum1;

enum Result1
{
	PASS, FAIL, NR;

	Result1()
	{
		System.out.println("Lets see how many time execute");
	}
}

public class Hy4
{
	public static void main(String[] args)
	{
		Result1 rs1 = Result1.PASS;

		// Result1 rs2 = new Result(); // not possble

	}
}
