import java.util.*;
public class inserting
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Elements in the Array=");
        n=sc.nextInt();
        int arr[]=new int[100];
        System.out.println("Enter the Elements of the Array=");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int beg;
        System.out.println("Enter the Element to be Inserted at the beggining of the Array=");
        beg=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=beg;
        n++;
        System.out.println("The Array after Inserting the Element at the beggining of the Array=");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int end;
        System.out.println("\nEnter the Element to be Inserted at the end of the Array=");
        end=sc.nextInt();
        arr[n]=end;
        n++;
        System.out.println("The Array after Inserting the Element at the end of the Array=");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int pos;
        System.out.println("\nEnter the Position to Insert the Element in the Array=");
        pos=sc.nextInt();
        int ele;
        System.out.println("Enter the Element to be Inserted at the Position in the Array=");
        ele=sc.nextInt();
        for(int i=n;i>pos-1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=ele;
        n++;
        System.out.println("The Array after Inserting the Element at the Position in the Array=");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
