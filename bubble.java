import java.util.*;
public class bubble
{
    public static void main(String args[])
    {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements in the Array =");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements of the Array =");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Sorting the Array using Bubble Sort =");
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
         System.out.println("The Sorted Array is =:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}