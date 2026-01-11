public class question20 {
    public static void main(String args[]) {
        int i, j, N = 5;

        for (i = 1; i <= N; i++) {
            for (j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i || i == N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next row
        }
    }
}
