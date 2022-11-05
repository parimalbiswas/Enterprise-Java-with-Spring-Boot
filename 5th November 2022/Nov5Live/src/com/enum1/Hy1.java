package com.enum1;

enum Result
{
	PASS, FAIL, NR;
}

public class Hy1
{
	enum Gender
	{
		MALE, FEMALE, OTHERS;
	}

	public static void main(String[] args)
	{
		Result r1 = Result.PASS;
		System.out.println(r1);

		Gender g1 = Gender.MALE;
		System.out.println(g1);

		int i = Gender.FEMALE.ordinal();
		System.out.println(i);

	}

}
