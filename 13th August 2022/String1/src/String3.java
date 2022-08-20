
public class String3
{

	public static void main(String[] args)
	{
		String s1 = "Google";
		String s2 = "google";
		String s3 = new String("Google");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2)); // compareTo return integer value. if both char are equal it return 0.
		// Its match with ASCII value

	}

}
