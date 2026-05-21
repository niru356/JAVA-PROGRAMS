import java.util.*;
public class sorted {
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements in the Array");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Elements of the Array");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < n; i++) {

            if(arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        if(count <= 1) {
            System.out.println("Array is Sorted and Rotated");
        }
        else {
            System.out.println("Array is NOT Sorted and Rotated");
        }
    }
}