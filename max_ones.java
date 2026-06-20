import java.util.*;
public class max_ones
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int max=0;
        int count=0;
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            max=Math.max(max,count);
        }
        System.out.println("The maximum number of consecutive 1's is: " + max);
    }
}