import java.io.*;
public class question2 {
    public static void main(String args[])throws IOException
    {
        int n,c,a=2,b=1,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            System.err.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
