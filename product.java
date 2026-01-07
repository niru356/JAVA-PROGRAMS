
import java.io.*;
public class product {
    public static void main(String args[])throws IOException
    {
        int n,product=1,Digit;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            Digit=n%10;
            product=product*Digit;
            n=n/10;
        }
        System.out.println("Product of the Digits ="+product);
    }
}
