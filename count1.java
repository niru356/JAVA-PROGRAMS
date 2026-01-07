import java.io.*;
public class count1{
    public static void main(String args[])throws IOException
    {
        int n,sum=0,d,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.err.println("Enter the Number");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            count++;
            n=n/10;
        }
        System.out.println("Sum of Digit ="+sum);
        System.out.println("Count the Digit ="+count);
    }
}