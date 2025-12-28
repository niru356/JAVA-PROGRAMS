import java.io.*;

public class prime {
    public static void main(String args[]) throws IOException {

        int num, i;
        boolean isPrime = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number = ");
        num = Integer.parseInt(br.readLine());

        // Check for 0 or 1
        if (num == 0 || num == 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }
}
