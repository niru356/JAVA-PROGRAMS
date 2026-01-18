import java.util.Scanner;

class question33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;

            for (int i = 1; i <= d; i++) 
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == num)
            System.out.println(num + " is a Strong Number");
        else
            System.out.println(num + " is not a Strong Number");
    }
}
