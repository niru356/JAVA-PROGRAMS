import java.io.*;
public class question13
{
    public static void main(String args[])throws IOException
    {
        int num,d,max=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        while(num>0)
        {
            d=num%10;
            if(d>max)
            {
                max=d;
            }
            num=num/10;
        }
        System.err.println("Maximum Digit in Number ="+max);
    }
}