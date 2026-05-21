import java.util.*;
public class second
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        int max=arr[0];
        int secondMax=arr[0];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Second largest element in the array is:");
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max)
            {
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}