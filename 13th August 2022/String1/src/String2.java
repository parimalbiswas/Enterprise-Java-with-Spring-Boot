
public class String2
{

	public static void main(String[] args)
	{
		String s1 = "Jadu"; // If one Jadu is Present and u r taring to create another same name memory. New
							// Object not create and s2 reference give to same object
		String s2 = "Jadu"; // Its create Only once in StringPool and refer by s1 and s2

		String s3 = new String("Jadu"); // Its create in Heap area. So Its

		System.out.println(s1 == s2); // True || It is comparing the References mean string object reference;
		System.out.println(s1 == s3); // False || It is comparing the address value of the object
										// (s1[2000] object != s3[4000]) i.e. False

//		RUN THE PROGRAM FOR BETTER UNDERSTANDING

		String ck1 = new String("Jio"); // Suppose its create object in 8000 location
		String ck2 = new String("Jio"); // Suppose its create object in 5000 location

		System.out.println(ck1 == ck2); // False || mean both reference variable holding different address of the object
										// [8000 !=5000]

		System.out.println(ck1.equals(ck2)); // True || Because Its now comparing with String Value(Character)

	}

}
