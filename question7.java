import java.io.*;
public class question7 {
    public static void main(String[] args)throws IOException
    {
        int n,i,fact=1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.err.println(fact+" ");
    }
}

