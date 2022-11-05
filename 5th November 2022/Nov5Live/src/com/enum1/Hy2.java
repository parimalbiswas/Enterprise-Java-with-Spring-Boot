package com.enum1;

enum Results
{
	PASS, FAIL, NR;

	int marks;

	Results()
	{
		System.out.println("Constractor is getting called");
	}

	public int getMarks()
	{
		return marks;
	}

	public void setMarks(int marks)
	{
		this.marks = marks;
	}

}

public class Hy2
{
	public static void main(String[] args)
	{

		Results.PASS.setMarks(45);
		int marks = Results.PASS.getMarks();
		System.out.println(marks);
	}
}
