
import java.io.*;
public class prime1 {
    public static void main(String[] args)throws IOException
    {
        int num,i,flag=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        if(num == 1 || num ==0)
        {
            System.out.println("Not a Prime Number");
        }
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not a Prime Number");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}