import java.util.*;
public class question11
{
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 10 elements in the array");
        int max=arr[0];
        int secmax=arr[0];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<5;i++)
        {
            if(arr[i]>secmax && arr[i]!=max)
            {
                secmax=arr[i];
            }
        }
        System.out.println("Second Largest Elements in the Array ="+secmax);
    }
}