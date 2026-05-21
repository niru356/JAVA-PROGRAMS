import java.util.*;
public class frequency
{
    public static void main(String args[])
    {
        int n,item,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements in the Array =");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements of the Array =");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to find the Frequency =");
        item=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==item)
            {
                flag++;
            }
        }
        System.out.println("Frequency of " + item + " is: " + flag);
    }

}