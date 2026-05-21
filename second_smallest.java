import java.util.*;
public class second_smallest
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
        int smallest=arr[0];
        int second_smallest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                second_smallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<second_smallest && arr[i]!=smallest)
            {
                second_smallest=arr[i];
            }
        }
        System.out.println("The second smallest element in the array is: "+second_smallest);
    }
}