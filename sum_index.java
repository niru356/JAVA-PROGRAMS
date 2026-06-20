import java.util.*;
public class sum_index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("Enter the Target Sum =");
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    sum=arr[i]+arr[j];
                    System.out.println("Number are ="+arr[i]+" and "+arr[j]);
                    System.out.println("Sum is ="+sum);
                }
            }
        }
    }
}