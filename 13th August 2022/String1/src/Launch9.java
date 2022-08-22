class Alien
{

}

public class Launch9
{

	public static void main(String[] args)
	{
		Alien a1 = new Alien();
		System.out.println(a1); // We will be getting HASCODE of the address of the object

		String s1 = new String("Java");
		System.out.println(s1.hashCode()); // In string we will get the value not get the object

//		HOW CAN WE GET THE ADDESS OF THE STRING OBJECT ??? ( Which method Can we use )

	}

}
