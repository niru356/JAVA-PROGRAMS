import java.io.*;
public class strong {
    public static void main(String args[])throws IOException
    {
        int i,n,fact=1,sum=0,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        int temp=n;
        for(i=n;i>0;i=i/10)
        {
            fact=1;
            for(j=1;j<=i%10;j++)
            {
                fact=fact*j;
            }
            sum=sum+fact;
        }
        if(sum==temp)
        {
            System.out.println(temp+"is a Strong Number");
        }
        else
        {
            System.out.println(temp+"is not a Strong Number");
        }
    }
}