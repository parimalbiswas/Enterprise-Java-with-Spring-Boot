
public class Prog4
{

	public static void main(String[] args)
	{

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());

		sb1.append("bhjdhjfhdjgtfgfgfgfgfgfgfgfgcfh");
		System.out.println(sb1.capacity());

		// If the capacity will fill internally JVM will increase the size using the
		// following formula
//		newCapacity = ( currentCapacity + 1 ) * 2;

		StringBuffer sb11 = new StringBuffer(19); // 19 capacity
		System.out.println(sb11.capacity());

		StringBuffer sb111 = new StringBuffer("abcdef"); // 19 capacity ( length of string + 16 )
		System.out.println(sb111.capacity());

//		2:06 minute

	}

}
