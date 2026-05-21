import java.util.*;

public class missing {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter the Number of Elements in the Array =");
        int n = sc.nextInt();

        // Declare array
        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter the Elements of the Array =");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum of array elements
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        // Calculate total expected sum
        int total_sum = (n * (n + 1)) / 2;

        // Find missing number
        int missing_number = total_sum - sum;

        // Print missing number
        System.out.println("The Missing Number in the Array is = " + missing_number);

        sc.close();
    }
}