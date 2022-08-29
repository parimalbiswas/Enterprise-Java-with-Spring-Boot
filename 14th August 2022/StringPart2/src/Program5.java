
public class Program5
{

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer();
		sb1.append("The Value is PIE");
		sb1.append(3.14);
		sb1.append("This is exactly   ");
		sb1.append(false);
		System.out.println(sb1);

		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}

}
