//Compile time error --> ; missing || Syntax error
//Runtime error  ->> live Application abnormal termination (Faulty logic by developer)
//Exception type-->
//1. Unchecked (By default )  2. Checked 

class Demo
{
	public void display()
	{
		display(); // Stack Overflow Exection
	}
}

public class Ex1
{

	public static void main(String[] args)
	{
		Demo d1 = new Demo();
		System.out.println("Object creation is complete. Going to call display");
		d1.display();
	}

}
