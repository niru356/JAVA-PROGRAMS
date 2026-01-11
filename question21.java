public class question21 {
    public static void main(String args[]) {
        int i, j, N = 5;

        for (i = 1; i <= N; i++) {

            // spaces for right alignment
            for (j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // stars and hollow logic
            for (j = 1; j <= i; j++) {
                if (i == 1 || i == N || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // next line after each row
            System.out.println();
        }
    }
}
