import java.util.*;

public class second2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the Array =");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements in the Array =");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int sec = Integer.MIN_VALUE;

        // Find maximum
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i] > sec) {
                sec = arr[i];
            }
        }

        if (sec == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("The second largest element is: " + sec);
        }
    }
}