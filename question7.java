import java.io.*;
public class question7 
{
    public static void main(String[] args)throws IOException
    {
        int num,sum=0,d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number =");
        num=Integer.parseInt(br.readLine());
        while(num>0)
        {
            d=num%10;
            sum=sum+d;
            num=num/10;
        }
        System.out.println("Sum of Digits =" +sum);
    }
}  

