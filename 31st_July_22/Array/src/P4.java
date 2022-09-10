
//If u dont initialize value in interzar type array. By default JVM will Allocate zero in it.
//and for String array default value is null;

public class P4 {

	public static void main(String[] args) {

			int  [] arr = new int[5]; //If u dont initialize value in interzar type array. By default JVM will Allocate zero in it.
			System.out.println(arr[2]);  // 0
			
			
			String  [] arr1 = new String[5]; //If u dont initialize value in for String array default value is null set by JVM;
			System.out.println(arr1[2]);  // null

	}

}
