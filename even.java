import java.util.*;

public class even {
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int i, j;

        // Input
        System.out.println("Enter the Elements of the Array:");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display Even Elements
        System.out.println("The Even Elements of the Array are:");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                if(arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]);
                }
            }
        }
        sc.close();
    }
}