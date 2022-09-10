import java.util.Iterator;

// In C or JS Java is not garded with bounderys.
		// If  u allocate 4 space memory like -> int [] arr = new int[3]. 
		// If u want to initialize value arr[5] = 20. 
		// In C or JS it is possible. 
		// But In JAVA its not possible.( Array index out of Bound )
		//That is why JAva is secure. || Array in JAva is gareded with bounderies.

public class P7 {

	public static void main(String[] args) {

		
		//int a1 [] = new int[9999999999]; //is out of range //3. Array demand continious memory location --> continious memory not found 
//		--> Solution is Collection API
		int arr [] =  new int[5];
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
			
			
			
		}
		
	}

}


// Disadvantahge of Of ARRAY
//1. We can Store Homoginious type of data ( Same type like int char etc)
//2.  Size of array is fixed. Cant grow or shink. 
//3. Array demand continious memory location  --> Solution is Collection API
