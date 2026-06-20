import java.util.*;
public class intersection
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the First Array =");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        
        System.out.println("Enter the Elements of the First Array =");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the Size of the Second Array =");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter the Elements of the Second Array =");
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("The Intersection of the Two Arrays is =");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}