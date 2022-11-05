package com.enum1;

enum Result2
{
	PASS, FAIL, NR;

}

public class Hy5
{
	public static void main(String[] args)
	{
		Result2 rs1 = Result2.FAIL;

		switch (rs1)
		{
		case PASS:

			System.out.println("pass");
			break;

		case FAIL:

			System.out.println("fail");
			break;

		case NR:

			System.out.println("no result");
			break;

		}
	}
}
