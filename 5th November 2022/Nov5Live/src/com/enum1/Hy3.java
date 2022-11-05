package com.enum1;

enum Gender
{
	MALE, FEMALE, OTHERS;
	// final static Gender MALE1 = new Gender(); => internally works
}

public class Hy3
{
	public static void main(String[] args)
	{
		Gender g1 = Gender.MALE;
		System.out.println(g1);

		System.out.println("------------");

		Gender arr[] = Gender.FEMALE.values();
		for (Gender element1 : arr)
		{
			System.out.println(element1 + " -> " + element1.ordinal());
		}
	}
}
