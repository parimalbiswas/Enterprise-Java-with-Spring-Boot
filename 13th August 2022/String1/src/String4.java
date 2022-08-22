
public class String4
{

	public static void main(String[] args)
	{

		String s1 = "Google"; // memory allocated in String C Pool ( Because Its not made using new Keyword )
		String s2 = "Java"; // memory allocated in String C Pool ( Because Its not made using new Keyword )
		String s3 = "Google" + "Java"; // memory allocated in String C Pool ( Because Its not made using new Keyword )

		String s4 = s1 + s2; // If reference are involved right side. that will not resolved during compile
								// time. That will be resolved during run time || Thats why object will be
								// create in Heap Area not in SCP area

		String s5 = s1 + "Khoka"; // At least one above reference variable on the right side. so object will be
									// create in Heap Area not in SCP area

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2)); // compareTo return integer value. if both char are equal it return 0.
		// Its match with ASCII value

	}

}
