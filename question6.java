import java.io.*;
public class question6 {
    public static void main(String args[])throws IOException
    {
        int n,d,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            d=n%10;
            count++;
            n=n/10;
        }
        System.out.println("Number of Digits =" +count);
    }
}
