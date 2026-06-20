import java.util.*;
public class Kadane_algo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The maximum subarray sum is: ");
        int max=arr[0];
        System.out.println("Enter the Target Value =");
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(sum>max)
                {
                    max=sum;
                }
                if(sum==target)
                {
                    System.out.println("The target value is found in the subarray from index "+i+" to index "+j);
                }
            }
        }
        System.out.println("The maximum subarray sum is: "+max);
    }
}