import java.io.*;
public class question5 {
    public static void main(String[] args)throws IOException
    {
        int n,i,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entert the Number of Terms =");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of First " +n+ " Natural Numbers is =" +sum);
    }
}