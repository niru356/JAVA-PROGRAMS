import java.util.*;

class Number {
    int arr[];
    int n;

    Number(int n) {
        this.n = n;
        arr = new int[n];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Elements of the Array =");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("Elements of the Array =");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Oddnum extends Number {
    int oddarr[];
    int count = 0;

    Oddnum(int n) {
        super(n);

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        oddarr = new int[count];
    }

    void copyodd() {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddarr[j++] = arr[i];
            }
        }
    }

    void displayodd() {
        System.out.println("Odd Numbers are =");
        for (int i = 0; i < count; i++) {
            System.out.print(oddarr[i] + " ");
        }
        System.out.println();
    }
}

class PrimeNum extends Oddnum {
    int primearr[];
    int pcount = 0;

    PrimeNum(int n) {
        super(n);

        copyodd();

        for (int i = 0; i < count; i++) {
            if (isPrime(oddarr[i])) {
                pcount++;
            }
        }

        primearr = new int[pcount];
    }

    // Prime check function
    boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    void copyPrime() {
        int j = 0;
        for (int i = 0; i < count; i++) {
            if (isPrime(oddarr[i])) {
                primearr[j++] = oddarr[i];
            }
        }
    }

    void displayprime() {
        System.out.println("Prime Numbers are =");
        for (int i = 0; i < pcount; i++) {
            System.out.print(primearr[i] + " ");
        }
        System.out.println();
    }
}

public class Main2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array =");
        int n = sc.nextInt();

        PrimeNum obj = new PrimeNum(n);

        obj.display();
        obj.displayodd();
        obj.copyPrime();
        obj.displayprime();
    }
}