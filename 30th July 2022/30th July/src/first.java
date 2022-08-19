//Design of the Calculator 
//( Its is like drawing and design of an car on a paper , You can't drive on the paper for this 
// you  need an object of a car to drive )

class Calculator {
	public int add(int num1, int num2) {

		int result = num1 + num2;
		return result;
	}

	public int add(int num1, int num2, int num3) // Method Overloading || its done with method name and parameter
	{

		int result = num1 + num2 + num3;
		return result;
	}
}

public class first {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 6;
		int num3 = 50;
		Calculator c1 = new Calculator();
		// c1 is a reference Variable || new Calculator() is the way of object creation

		int result = c1.add(num1, num2, num3); // delegate
		System.out.println(result);
	}

}
