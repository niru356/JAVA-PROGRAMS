import java.io.*;
public class question12
{
    public static void main(String args[])throws IOException
    {
        int n,i,flag=0,j,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Terms =");
        n=Integer.parseInt(br.readLine());
        for(i=2;i<=n;i++)
        {
            flag=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                sum+=i;
            }
        }
        System.out.println("Sum of the Prime Numbers up to "+n+" is ="+sum);
    }
}
