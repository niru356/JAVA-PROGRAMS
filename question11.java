import java.io.*;
public class question11 {
    public static void main(String args[])throws IOException
    {
        int num,pro=1,d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        while(num>0)
        {
            d=num%10;
            pro=pro*d;
            num=num/10;
        }
        System.err.println("Product of the Digits ="+pro);
    }
}
