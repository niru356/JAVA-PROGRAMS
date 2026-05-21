import java.util.*;
public class duplicate
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of elements in the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate elements in the array are:");
        int k=0;
        for(int j=1;j<n;j++)
        {
            if(arr[k]!=arr[j])
            {
                k++;
                arr[k]=arr[j];
            }
        }
        for(int i=0;i<=k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}