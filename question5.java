import java.util.*;
public class question5
{
    public static void main(String[] args)
    {
        int arr[]=new int[5];
        int count=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements of the Array =");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        System.out.println("Number of Even Elements in the Array ="+count);
    }
}
