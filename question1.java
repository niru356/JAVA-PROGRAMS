import java.io.*;

public class question1 {
    public static void main(String[] args) throws IOException {
        int num, temp, sqr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number =");
        num = Integer.parseInt(br.readLine());

        sqr = num * num;
        temp = num;

        while (temp > 0) {
            if (temp % 10 != sqr % 10) {
                System.out.println("Not Automorphic Number");
                return;
            }
            temp = temp / 10;
            sqr = sqr / 10;
        }

        System.out.println("Automorphic Number");
    }
}
