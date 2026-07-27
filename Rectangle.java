import java.util.*;

class Rectangle {
    int Length, Breadth, Area, Perimeter;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of the Rectangle:");
        Length = sc.nextInt();

        System.out.println("Enter the Breadth of the Rectangle:");
        Breadth = sc.nextInt();
    }

    void Area() {
        Area = Length * Breadth;
        Perimeter = 2 * (Length + Breadth);

        System.out.println("Area of the Rectangle = " + Area);
        System.out.println("Perimeter of the Rectangle = " + Perimeter);
    }

    void display() {
        System.out.println("Length of Rectangle = " + Length);
        System.out.println("Breadth of Rectangle = " + Breadth);
        System.out.println("Area of Rectangle = " + Area);
        System.out.println("Perimeter of Rectangle = " + Perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.Area();
        obj.display();
    }
}