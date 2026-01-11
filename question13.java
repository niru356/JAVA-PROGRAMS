import java.io.*;
public class question13
{
    public static void main(String[] args)throws IOException
    {
        int n,i,j,flag=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Terms =");
        n=Integer.parseInt(br.readLine());
        for(i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i+" ");
                n=n/i;
            }
        }
        if(n>2)
        {
            System.out.println(n);
        }
    }
}
