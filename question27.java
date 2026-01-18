public class question27 {
    public static void main(String args[]) {
        int i, j;

        // Upper half
        for(i = 1; i <= 5; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower half
        for(i = 4; i >= 1; i--) {
            for(j = 1; j <= i; j++) {
                System.out.print(j + " ");  // FIXED
            }
            System.out.println();
        }
    }
}
