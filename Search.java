import java.util.*;
public class Search
{
    public static void main(String args[])
    {
        int flag=0,i;
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 10 elements of the array =");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched =");
        int key=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(arr[i]==key)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found at index "+i);
        }
        else
        {
            System.out.println("Element not found in the array");
        }
    }
}