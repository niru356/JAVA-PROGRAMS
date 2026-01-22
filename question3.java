import java.io.*;
public class question3 {
    public static void main(String[] args)throws IOException
    {
        int n,i,a=0,b=1,c=1,d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Terms =");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}
