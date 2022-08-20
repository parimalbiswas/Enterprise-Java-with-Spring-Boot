public class String1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str1 = "Abra Ka Dabra"; // Memory will allocate under SCP String Constant pool in
										// the HEAP Area if we don't use new Keyword
		System.out.println(str1);
		String str2 = new String("New");// Memory will allocate in the HEAP Area if we use new Keyword (Outside SCP
										// memory will be allocated
		System.out.println(str2);

		String s1 = "Java";
		String s2 = "Java";
		// In StringPool if "Java" word is present, JVM will not create any String
		// Object
		// there for s2. s2 will point same "Java"
		// Duplicates are not allowed in StringPool

		String strobj1 = new String("New");
		String strobj2 = new String("New");
		// Here if u create 100 duplicate Object with same String name 100 separately
		// created in the main heap area (with new keyword)

		// String comparitionString
		// ==
		// equals()
		// equalIgnoreCase()
		// compaeTo()

	}

}
