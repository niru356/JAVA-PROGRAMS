import java.io.*;
public class pattern1 {
    public static void main(String args[])throws IOException
    {
        int i,j,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Rows =");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
