import java.util.*;
public class question3 {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        System.out.println("Enter the 5 Elements of the Array =");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array Elements ="+sum);
        System.out.println("Average of Array Elements ="+(sum/arr.length));
    }
}
