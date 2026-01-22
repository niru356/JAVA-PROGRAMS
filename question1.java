import java.io.*;
public class question1 {
    public static void main(String args[])throws IOException
    {
        int n,sum=0,i,a=0,b=1,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            sum=sum+a;
            c=a+b;
            a=b;
            b=c;
        }
        System.err.println("Sum of the Fibonancii Series ="+sum);
    }
}
