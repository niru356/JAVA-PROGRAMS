import java.util.*;
class Avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements:=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Eter the Elements =");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double Avg=(double)sum/n;
        System.out.println("The Average is ="+Avg);
    }
}