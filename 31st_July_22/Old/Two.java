import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr[][] = new int[3][4];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("i is class " +i  + "Student j " +j);
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Marks of students");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }



    }
}
