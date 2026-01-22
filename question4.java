
import java.io.*;
public class question4 {
    public static void main(String args[])throws IOException
    {
        int n,i,a=1,sum,b=3;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            sum=2*a+1;
            a=b;
            b=sum;
            System.err.println(a+" ");
        }
    }
}
