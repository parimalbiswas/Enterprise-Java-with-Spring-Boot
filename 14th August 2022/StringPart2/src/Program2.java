
public class Program2
{

	public static void main(String[] args)
	{

		StringBuffer sb1 = new StringBuffer("Jio");
		StringBuffer sb2 = new StringBuffer("Jio");
		System.out.println(sb1.equals(sb2));

		String s1 = "Jio";
		String s2 = "Jio";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

	}

}
