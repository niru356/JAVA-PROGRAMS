import java.util.*;
public class question10
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 10 elements in the array");
        int max=arr[0];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest Elements in the Array ="+max);
    }
}