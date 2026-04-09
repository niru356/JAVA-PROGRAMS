import java.util.*;
class A1
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number of Elements:=");
       int n=sc.nextInt();
       int arr[][]=new int[n][n];
       int i,j;
       System.out.println("Enter the Elements =");
       for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               arr[i][j]=sc.nextInt();
           }
       }
       
       System.out.println("Matrix Elements:");
       for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
       sc.close();
    }
}