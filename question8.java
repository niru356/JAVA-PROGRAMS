import java.util.*;

class Square {
    int side;

    Square(int side) {
        this.side = side;
    }

    void calculateArea() {
        System.out.println("Area of Square = " + (side * side));
    }

    void display() {
        System.out.println("Side of the Square = " + side);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side of the Square =");
        int side = sc.nextInt();

        Square s = new Square(side);
        s.display();
        s.calculateArea();
    }
}