import java.io.*;
public class question11 
{
    public static void main(String[] args)throws IOException
    {
        int num,rev=0,rem,temp;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        temp=num;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
