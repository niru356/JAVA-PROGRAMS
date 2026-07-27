import java.util.*;

// Parent Class
class Student {
    String college;

    // Parent Constructor
    Student() {
        college = "ABC College";
    }

    Student(String college) {
        this.college = college;   // this keyword
    }
}

// Child Class
class Name extends Student {
    String name;
    int roll_no;

    // Default Constructor
    Name() {
        super();   // Calls parent default constructor
        this.name = "Nirakar";   // this keyword
        this.roll_no = 120;
    }

    // Parameterized Constructor
    Name(String name, int roll_no, String college) {
        super(college);          // Calls parent parameterized constructor
        this.name = name;        // this keyword
        this.roll_no = roll_no;
    }

    // One Parameter Constructor
    Name(String name) {
        super();
        this.name = name;
    }

    // Display Method
    void display() {
        System.out.println("College : " + college);
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + roll_no);
    }

    public static void main(String[] args) {

        Name obj1 = new Name();                           // Default Constructor
        Name obj2 = new Name("Rahul", 101, "XYZ College"); // Parameterized Constructor
        Name obj3 = new Name("Amit");                      // One Parameter Constructor

        System.out.println("Object 1:");
        obj1.display();

        System.out.println("\nObject 2:");
        obj2.display();

        System.out.println("\nObject 3:");
        obj3.display();
    }
}