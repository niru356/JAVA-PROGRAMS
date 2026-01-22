import java.io.*;
public class question9 {
    public static void main(String[] args)throws IOException
    {
        int n,i=1,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.err.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        while(i<=n)
        {
            System.err.println(i+" ");
            i=i*2;
            count++;
        }
        System.err.println("Total Power of 2 = "+count);
    }
}
