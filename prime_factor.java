
import java.io.*;

public class prime_factor {
    public static void main(String[] args)throws IOException
    {
        int num,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        for(i=2;i<=num;i++)
        {
            while(num%i==0)
            {
                System.out.println("Prime Factors are =" +i);
                num=num/i;
            }
        }
    }
}