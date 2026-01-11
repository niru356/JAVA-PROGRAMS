import java.io.*;

public class question18 {
    public static void main(String[] args) throws IOException {
        int i, j;
        int rows = 5;

        for (i = 1; i <= rows; i++) {
            // print leading spaces
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // print stars
            for (j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
