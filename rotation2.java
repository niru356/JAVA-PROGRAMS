import java.util.*;
public class rotation2
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate the array:");
        k=sc.nextInt();
        k=k%n; // To handle cases where k is greater than n 
        System.out.println("Rotating the array to the left by "+k+" positions:");
        int temp[]=new int[k];
        for(int i=0;i<k;i++)
        {
            temp[i]=arr[i];
        }

        for(int i=k;i<n;i++)
        {
            arr[i-k]=arr[i];
        }
        for(int i=0;i<k;i++)
        {
            arr[n-k+i]=temp[i];
        }
        System.out.println("The rotated array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}