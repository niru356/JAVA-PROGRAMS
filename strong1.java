import java.io.*;

public class strong1 {
    public static void main(String args[]) throws IOException {

        int num, temp, rem, sum = 0, i, fact;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number = ");
        num = Integer.parseInt(br.readLine());

        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            fact = 1;
            for (i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            temp = temp / 10;
        }

        if (num == sum) {
            System.out.println("Number is Strong");
        } else {
            System.out.println("Number is Not Strong");
        }
    }
}
