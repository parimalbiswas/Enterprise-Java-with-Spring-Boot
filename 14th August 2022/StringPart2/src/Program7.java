
public class Program7
{

	public static void main(String[] args)
	{
		StringBuffer sb2 = new StringBuffer("abcdefgh");
		sb2.insert(2, "jdhjfhd");
		System.out.println(sb2);

		StringBuffer sb21 = new StringBuffer("abcdef123456789");
		sb21.insert(3, 9);
		System.out.println(sb21);

//		sb21.delete(1, sb21.length());
//		System.out.println(sb21);   --> when you uncomment this its edited on the main string

		sb21.deleteCharAt(5);
		System.out.println(sb21);

		sb21.delete(5, sb21.length());
		System.out.println(sb21);

		sb21.reverse();
		System.out.println(sb21);

	}

}
