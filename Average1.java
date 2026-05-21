import java.util.*;
public class Average1
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of the Elements in the Array =");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of the Array =");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        double average;
        System.out.println("Average Elements in the Array =");
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        average=(double)sum/n;
        System.out.println("Average of the Elements in the Array = "+average);
    }
}