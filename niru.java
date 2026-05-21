import java.util.*;
public class niru
{
    public static void main(String args[])
    {
        int n,item,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements in the Array =");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements of the Array =");
        int maxFreq=0;
        int maxelement=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Counting the Frequency of Each Element =");
        for(int i=0;i<n;i++)
        {
            flag=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    flag++;
                }
                if(flag>maxFreq)
                {
                    maxFreq=flag;
                    maxelement=a[i];
                }
            }
            System.out.println("Frequency of " + a[i] + " is: " + flag);
        }
        System.out.println("Maximum frequency is: " + maxFreq);
        System.out.println("Element with maximum frequency is: " + maxelement);
    }
}

    