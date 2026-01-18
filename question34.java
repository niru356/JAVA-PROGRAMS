import java.io.*;

public class question34 {
   public static void main(String args[]) throws IOException {
       int num, d, temp, sqr, sum = 0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter the Number =");
       num = Integer.parseInt(br.readLine());

       if (num > 0 && num <= 9) {
           sqr = num * num;

           while (sqr > 0) {
               d = sqr % 10;
               sum = sum + d;
               sqr = sqr / 10;
           }

           if (sum == num) {
               System.out.println("Neon Number");
           } else {
               System.out.println("Not Neon Number");
           }
       } else {
           System.out.println("Enter a number between 1 and 9");
       }
   }
}
