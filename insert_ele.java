import java.util.*;
public class insert_ele
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be inserted:");
        int ele=sc.nextInt();
        System.out.println("Enter the position to insert the element:");
        int pos=sc.nextInt();
        for(int i=n;i>=pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=ele;
        System.out.println("The array after insertion is:");
        for(int i=0;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}