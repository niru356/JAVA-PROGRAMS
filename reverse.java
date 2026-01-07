import java.io.*;
public class reverse
{
    public static void main(String args[])throws IOException
    {
        int num,rev=0,rem;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number =");
        num=Integer.parseInt(br.readLine());
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of the Number ="+rev);
    }
}
