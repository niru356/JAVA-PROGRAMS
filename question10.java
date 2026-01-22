
import java.io.*;
public class question10 {
    public static void main(String args[])throws IOException
    {
        int num,d,sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.err.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        while(num>0)
        {
            d=num%10;
            if(d % 2 == 0)
            {
                sum=sum+d;
            }
            num=num/10;
        }
        System.err.println("Sum od Even Digits ="+sum);
    }
}
