import java.io.*;

public class strong3 {
    public static void main(String args[]) throws IOException {

        int num, temp, rem, sum, i, j, fact;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number = ");
        num = Integer.parseInt(br.readLine());

        for (i = 1; i <= num; i++) {
            temp = i;
            sum = 0;

            while (temp > 0) {
                rem = temp % 10;
                fact = 1;

                for (j = 1; j <= rem; j++) {
                    fact = fact * j;
                }

                sum = sum + fact;
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
