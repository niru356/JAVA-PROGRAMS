import java.util.*;
public class copy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int arr1[]=new int[5];
        int i;
        System.out.println("Enter the 5 elements =");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are =");
        for(i=0;i<5;i++)
        {
            arr1[i]=arr[i];
            System.out.println(arr1[i]+" ");
        }
    }
}