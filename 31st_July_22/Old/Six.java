public class Six {
    public static void main(String[] args) {
        int arr[] = { 20, 30, 50, 2, 6, 0 };
        int key = 0;

        for (int elem : arr) {
            if (elem == key) {
                System.out.println("yes");
                // break;
                System.exit(0);
            } 
        }
        System.out.println("Not found");
    }
}
