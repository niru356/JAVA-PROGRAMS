import java.util.*;
public class small_2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int smallest=arr[0];
        int secondSmallest=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]!=smallest)
            {
                secondSmallest=arr[i];
            }
        }
        System.out.println("The smallest element is: " + smallest);
        System.out.println("The second smallest element is: " + secondSmallest);
        sc.close();
    }
}