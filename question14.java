import java.io.*;

public class question14 {
    public static void main(String args[]) throws IOException {
        int num, d, min;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Number = ");
        num = Integer.parseInt(br.readLine());

        min = num % 10;   // initialize min with last digit

        while (num > 0) {
            d = num % 10;
            if (d < min) {
                min = d;
            }
            num = num / 10;
        }

        System.out.println("Minimum Digit in Number = " + min);
    }
}

