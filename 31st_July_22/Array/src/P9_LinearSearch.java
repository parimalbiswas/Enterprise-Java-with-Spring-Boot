//Linear Search  -> One By One -> Sequationl

public class P9_LinearSearch {

	public static void main(String[] args) {
		
		int arr [] =  {2,5,6,3,8,9};
		
		int key=6;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==key) {
				System.out.println("Yes Present in this index " +i);
				System.exit(0); // Out from Program
//				break;   // mean OUt from Loop only
//				return; // mean OUt from program
			}	
		}
		System.out.println("Not Present");
	}

}


// Bineary Search --> Mean array must be in sorted Order
//1. Sort
//2. Bineary Search
//3. Find Mid Value
// If key is in Mid value then return
// If key > mid ( I will not search Rest Of the Part )
//If key < mid ( I will Search 1st half part)

// Searching is very fast. Bineary search is fast over linear  Search
// But array must be sorted.


