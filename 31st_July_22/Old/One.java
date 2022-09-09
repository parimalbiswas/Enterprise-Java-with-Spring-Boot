import java.util.Scanner;

// Array 
public class One {
    public static void main(String[] args) {
        int a[] = new int[5];
        // a[0] = 10;
        // a[1] = 20;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
            a[i] = scan.nextInt();
        }

        System.out.println("Printing hg ");

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+ "   ");
        }

    }
}
