
public class Prog3Interview
{

	public static void main(String[] args)
	{
		final StringBuffer sb1 = new StringBuffer("Sachine");
		sb1.append("IND");
		System.out.println(sb1);// SachineIND

//		sb1 = new StringBuffer("Tendulkar"); // Complete time error
		System.out.println(sb1);

//		If the variable is of primitive type and if it is final then the value of
//		the variable should not be changed,if we try to change it would result in "CompileTimeError".

//		If the variable if of reference type and if it is of mutable nature then
//		as per its mutable nature the object data can be
//		changed,it would not result in "CompileTimeError",but if we try to
//		reassign the reference variable with a new object address
//		then it would result in "CompileTimeError".

	}

}
