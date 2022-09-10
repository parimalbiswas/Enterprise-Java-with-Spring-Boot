// WAP to copy one array into another array

public class P8 {

	public static void main(String[] args) {
		int arr [] =  {2,5,6,3,8,9};
		int brr [] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			brr[i]=arr[i];
		}
		
		
		for (int elem : brr) {
			System.out.println(elem);
		}

	}

}
