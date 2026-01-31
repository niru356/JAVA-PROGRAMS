import java.io.*;

public class question15 {
    public static void main(String args[]) throws IOException {
        int num, first, last;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number =");
        num = Integer.parseInt(br.readLine());

        last = num % 10;      // last digit

        while (num >= 10) {
            num = num / 10;   // reduce number
        }

        first = num;          // first digit

        System.out.println("First Digit of the Number = " + first);
        System.out.println("Last Digit of the Number = " + last);
    }
}
