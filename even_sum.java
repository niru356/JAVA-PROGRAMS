import java.io.*;
public class even_sum {
    public static void main(String args[])throws IOException
    {
        int i,sum=0,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Value of N:");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;

            }
        }
        System.out.println("Sum of Even Numbers from 1 to "+n+" = "+sum);
    }
}