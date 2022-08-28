class Alien
{

}

public class Program1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = new String("Jio"); // Object will in SPA and Heap Area
		s1.concat("Mama"); // 1 object in SPA
		System.out.println(s1); // Jio

		StringBuilder s2 = new StringBuilder("Jio"); // Object will in SPA and Heap Area
		s2.append("Mama"); // 1 object in SPA
		System.out.println(s2); // JioMama

		StringBuffer s3 = new StringBuffer("Jio"); // Object will in SPA and Heap Area
		s3.append("Mama"); // 1 object in SPA
		System.out.println(s3); // JioMama

		// StringBuffer are mutable , If we try to change the object, the change would
		// happen in the same memory --> Call
	}

}
