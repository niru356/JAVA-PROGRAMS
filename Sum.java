import java.util.*;
public class Sum 
{
    public static void main(String args[])
    {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        System.out.println("Enter the Elements of the Array =");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sum=sum+arr[i][j];
            }
        }
        System.err.println("The Sum of the Elements of the Array is ="+sum);
    }
}
