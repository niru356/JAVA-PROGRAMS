import java.io.*;
public class even2
{
    public static void main(String args[])throws IOException
    {
        int num,rem,even=0,odd=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number =");
        num=Integer.parseInt(br.readLine());
        while(num!=0)
        {
            rem=num%10;
            if(rem%2==0)
            {
                even=even+1;
            }
            else
            {
                odd=odd+1;
            }
            num=num/10;
        }
        System.out.println("Total Even Digit ="+even);
        System.out.println("Total Odd Digit ="+odd);
    }
}