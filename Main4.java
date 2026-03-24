import java.util.Scanner;

abstract class Shape
{
    double length, breadth, height;

    Shape(double l, double b, double h)
    {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    abstract void volume();
    abstract void surfaceArea();
}

// Cube Class
class Cube extends Shape
{
    Cube(double side)
    {
        super(side, side, side);
    }

    void volume()
    {
        double vol = length * length * length;
        System.out.println("Volume of Cube = " + vol);
    }

    void surfaceArea()
    {
        double sa = 6 * length * length;
        System.out.println("Surface Area of Cube = " + sa);
    }
}

// Cuboid Class
class Cuboid extends Shape
{
    Cuboid(double l, double b, double h)
    {
        super(l, b, h);
    }

    void volume()
    {
        double vol = length * breadth * height;
        System.out.println("Volume of Cuboid = " + vol);
    }

    void surfaceArea()
    {
        double sa = 2 * (length * breadth + length * height + breadth * height);
        System.out.println("Surface Area of Cuboid = " + sa);
    }
}

// Cylinder Class
class Cylinder extends Shape
{
    double radius;

    Cylinder(double r, double h)
    {
        super(0, 0, h);
        this.radius = r;
    }

    void volume()
    {
        double vol = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + vol);
    }

    void surfaceArea()
    {
        double sa = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder = " + sa);
    }
}

// Main Class
public class Main4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Cube input
        System.out.print("Enter side of Cube: ");
        double side = sc.nextDouble();
        Cube c = new Cube(side);
        c.volume();
        c.surfaceArea();

        // Cuboid input
        System.out.print("\nEnter length, breadth, height of Cuboid: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Cuboid cb = new Cuboid(l, b, h);
        cb.volume();
        cb.surfaceArea();

        // Cylinder input
        System.out.print("\nEnter radius and height of Cylinder: ");
        double r = sc.nextDouble();
        double ch = sc.nextDouble();
        Cylinder cy = new Cylinder(r, ch);
        cy.volume();
        cy.surfaceArea();

        sc.close();
    }
}