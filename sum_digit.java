import java.io.*;
public class sum_digit {
    public static void main(String args[])throws IOException
    {
        int n,sum=0,last,first;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        last=n%10;
        first=n;
        while(n>=10)
        {
            n=n/10;
        }
        first=n;
        sum=first+last;
        System.out.println("Sum of the First and Last Digit = "+sum);
    }
}


