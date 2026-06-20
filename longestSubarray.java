import java.util.*;

public class longestSubarray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxlength = 0;

        while (right < n) {

            while (left <= right && sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                maxlength = Math.max(maxlength, right - left + 1);
            }

            right++;

            if (right < n) {
                sum += arr[right];
            }
        }

        System.out.println("The length of the longest subarray with sum "
                + target + " is: " + maxlength);

        sc.close();
    }
}