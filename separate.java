import java.util.*;

public class separate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int even[] = new int[n];
        int odd[] = new int[n];

        System.out.println("Enter the Elements of the Array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int e = 0, o = 0;

        // Separate even and odd elements
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                even[e++] = arr[i];
            } else {
                odd[o++] = arr[i];
            }
        }

        System.out.println("Even elements in the Array:");
        for(int i = 0; i < e; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println();

        System.out.println("Odd elements in the Array:");
        for(int i = 0; i < o; i++) {
            System.out.print(odd[i] + " ");
        }

        sc.close();
    }
}