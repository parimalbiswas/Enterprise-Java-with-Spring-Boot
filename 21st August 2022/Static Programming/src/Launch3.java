import java.util.Scanner;

//Farmer Loan Application 

class Farmer {
	private float pa;
	private float td;
	private float si;
	static private float ri; // memory will allocate only once
	static int c = 5; // Static variable are VIM. Can access from main without create object like
						// Farmar.c=5;

	static { // before main method load
		ri = 2.5f;
	}

	public void acceptInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter loan amount");
		pa = scanner.nextFloat();

		System.out.println("Enter time need to repay");
		td = scanner.nextFloat();
//		ri = 2.5f;

	}

	void compute() {
		si = (pa * td * ri) / 100;
	}

	public void display() {
		System.out.println("SI id " + si);
	}
}

public class Launch3 {

	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();

		f1.acceptInput();
		f1.compute();
		f1.display();

		f2.acceptInput();
		f2.compute();
		f2.display();

	}

}

//Principal --> Farmer decide
//Duration ->
//INterest -> 
