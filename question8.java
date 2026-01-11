import java.io.*;
public class question8
{
    public static void main(String args[])throws IOException
    {
        int n,i,flag=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        if(n==1 || n==0)
        {
            System.out.println("Not Prime Number");
        }
        else
        {
            for(i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not Prime Number");
            }
        }
    }
}

        