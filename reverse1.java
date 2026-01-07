import java.io.IOException;

public class reverse1 {
    public static void main(String args[]) throws IOException {

        String str = "HELLO";
        String rev = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String is = " + rev);
    }
}
