
import java.io.*;
public class question2 {
    public static void main(String args[])throws IOException
    {
        int n,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Terms =");
        n=Integer.parseInt(br.readLine());
        for(i=n;i>=1;i--)
        {
            System.out.print(i+" ");
        }
    }
}
