import java.util.Iterator;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		int [] a = new int[5];
//		a[0] = 10;
//		a[1] = 20;
		
		Scanner scanner = new Scanner(System.in);
		
//		length mean property of array not method.
//		If It was a method () parenthesis should be there. 
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Please enter the marks"+i);
			a[i]=scanner.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] +" "+i);
		}
		
		

	}

}
