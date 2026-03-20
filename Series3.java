import java.util.*;
public class Series3 {
    public static void main(String args[]) {
        int n, i;
        double sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth Term =");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + Math.pow(i, 3);
            } else {
                sum = sum + Math.pow(i, 2); 
            }
        }

        System.out.println("Sum of the series = " + sum);
        sc.close();
    }
}
