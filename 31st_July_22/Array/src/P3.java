




import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		
		Scanner  sc1= new Scanner(System.in);
		
		int [][] arr = new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[5];
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.println("Enter marks of class"+i +"Student"+j);
				arr[i][j]=sc1.nextInt();
			}
		}
		
		
		System.out.println("Marks of the Students are");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}



//2:31



