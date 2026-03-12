import java.util.*;
public class question4 {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i,max=arr[0];
        System.out.println("Enter the Elements of the Array =");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.err.println("Maximum Elements in the Array ="+max);
    }
}
