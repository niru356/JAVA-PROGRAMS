import java.util.*;
public class insertion
{
    public static void main(String[] args) {
        int n,temp;
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of elements");
        n=sc.nextInt();
        System.out.println("Enter the Array Elements =");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorting the Array using Insertion Sort");
        for(int i=1;i<=n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println("The Sorted Array is =:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}