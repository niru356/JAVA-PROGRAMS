import java.util.*;

public class twosum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target Sum:");
        int target = sc.nextInt();

        int count = 0;

        System.out.println("Pairs are:");

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == target) {
                    count++;

                    System.out.println(arr[i] + " + " + arr[j] +" = " + target);
                }
            }
        }

        System.out.println("The number of pairs with sum "+ target + " is: " + count);

        sc.close();
    }
}