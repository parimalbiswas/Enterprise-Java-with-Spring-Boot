package second;

class Addition
{
	void add(int a, float b) // Differentiate method using method name and parameter type [Not return type]
	{
		float c = a + b;
		System.out.println(c);
	}

	float add(int a, int b)
	{
		float c = a + b;
		System.out.println(c);
		return c;
	}

	void add(int a, float b, int c)
	{
		float res = a + b;
		System.out.println(res);

	}
}

public class second
{

	public static void main(String[] args)
	{
		Addition ad1 = new Addition();
		ad1.add(0, 5.5f); // It will go to 1st add. %STORY%

	}

}
