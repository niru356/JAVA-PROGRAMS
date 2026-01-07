import java.io.*;

public class Armstrong1000 {
    public static void main(String args[]) throws IOException {

        int num, temp, rem, sum;

        System.out.println("Armstrong numbers between 1 and 1000 are:");

        for (num = 1; num <= 1000; num++) {
            temp = num;
            sum = 0;

            while (temp > 0) {
                rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
