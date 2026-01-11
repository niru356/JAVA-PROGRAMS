import java.io.*;
public class question14 {
    public static void main(String[] args) throws IOException {

        int n, i, max = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number:");
        n = Integer.parseInt(br.readLine());

        int temp = n; // store original value

        for (i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;

                if (i > max) {
                    max = i;
                }
            }
        }

        // If number itself is prime
        if (max == 0) {
            max = temp;
        }

        System.out.println("The Largest Prime Factor is = " + max);
    }
}
