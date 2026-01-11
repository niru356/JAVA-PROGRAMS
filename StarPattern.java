public class StarPattern {
    public static void main(String[] args) {

        int n = 5;   // number of rows
        int i, j;

        for (i = 1; i <= n; i++) {

            // print leading spaces
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
