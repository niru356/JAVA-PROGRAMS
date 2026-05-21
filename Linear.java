import java.util.*;
public class Linear
{
    public static void main(String args[])
    {
        int n,item,flag=0;
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the Number of Elements in the Array =");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements of the Array =");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Elements to be Searched =");
        item=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==item)
            {
                System.out.println("Element Found at Position ="+(i+1));
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Element Not Found in the Array");
        }
    }
}
