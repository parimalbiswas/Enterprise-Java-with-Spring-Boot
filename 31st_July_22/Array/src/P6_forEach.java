//		array  creation type

public class P6_forEach {

	public static void main(String[] args) {
	
//		array  creation type
		int a1 []= {1,2,3,4,5,6};
		
		int a2 [] =  new int[]{1,2,3,4,5,6};
		
		int a3 [] =  new int[4];
		
		
		

		
		int [][] arr1 = new int[2][3];
		
		int [][] arr2 =  {{2,4,5},{2,3,6}};
		
		// Jacked Array
		int [][] arr3 =  {{2,4,5},{2,3}};
		
		
//		forEach Loop
//		
//	for(datatype eleement : arrayname)
//		{
//			//body
//		}
		
		int x1 []= {1,2,3,4,5,6};
		
		for (int elem : x1) {
			System.out.println(elem*2);
		}
		
		
		//2D array
		
		int [][] x2 =  {{2,4,5},{2,3,6}};
		
		for (int[] elm1 : x2)
		{
			for (int elem2 : elm1) 
			{
				System.out.println(elem2);
			}
		}
	
		

		
	

	}

}
