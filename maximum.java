import java.util.*;
public class maximum
{
    public static void main(String args[])
    {
        int i;
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 10 elements of the Array =");
        int max=0;
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The maximum element in the array is =");
        for(i=0;i<10;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is "+max);
    }
}