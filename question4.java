import java.io.*;

public class question4 {
    public static void main(String args[]) throws IOException
    {
        int num, temp, d, sum = 0, count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number =");
        num = Integer.parseInt(br.readLine());

        temp = num;

        // Count digits
        while(temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;

        // Calculate Disarium sum
        while(temp > 0) {
            d = temp % 10;
            sum = sum + (int)Math.pow(d, count);
            count--;
            temp = temp / 10;
        }

        if(sum == num)
            System.out.println("Disarium Number");
        else
            System.out.println("Not Disarium Number");
    }
}
