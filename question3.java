import java.io.*;
public class question3 {
    public static void main(String args[]) throws IOException
    {
        int num, d, temp, sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the Number =");
        num = Integer.parseInt(br.readLine());
        
        temp = num;   // store original number
        
        while(num > 0)
        {
            d = num % 10;
            sum = sum + d;
            num = num / 10;
        }
        
        if(temp % sum == 0)   // ✅ correct check
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }
}
