import java.util.*;
public class median
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        double median;
        if(n%2==0)
        {
            median=(arr[n/2-1]+arr[n/2])/2.0;
        }
        else
        {
            median=arr[n/2];
        }
        System.out.println("Median of the array is: " + median);
    }
}