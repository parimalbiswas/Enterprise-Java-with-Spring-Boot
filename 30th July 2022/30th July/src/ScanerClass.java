import java.util.Scanner;

class Hellow {
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

public class ScanerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in mean take the input from console(Terminal)

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Hellow c1 = new Hellow();
		int result = c1.add(num1, num2); // delegate
		System.out.println(result);
	}

}
