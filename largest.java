import java.util.*;
public class largest
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of the Elements in the Array =");
        n=sc.nextInt();
        int a[]=new int[n];
        int largest=a[0];
        System.out.println("Enter the Elements of the Array =");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Finding the Largest Element in the Array =");
        for(int i=0;i<n;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
        }
        System.out.println("The Largest Element in the Array is = " + largest);
    }
}