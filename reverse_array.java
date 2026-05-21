import java.util.*;
public class reverse_array
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements in the Array =");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of the Array =");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Reversed Array is =");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}