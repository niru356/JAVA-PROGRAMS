import java.util.Scanner;
public class matrix_pro
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int z[]=new int[n];
        int i,j;
        System.out.println("Enter the first matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                x[i]=sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                y[i]=sc.nextInt();
            }
        }
        System.out.println("The product of the two matrices is: =");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                z[i]+=x[i]*y[j];
                System.out.print(z[i]+" ");
            }
            System.out.println();
        }
    }
}