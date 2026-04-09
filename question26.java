package college;
import java.util.Scanner;

class Student
{
    String name;
    int rollno;

    void show(Scanner sc)
    {
        System.out.println("Enter the name of the student:");
        name = sc.nextLine();

        System.out.println("Enter the roll number of the student:");
        rollno = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    void display()
    {
        System.out.println("Name of the student: " + name);
        System.out.println("Roll number of the student: " + rollno);
    }
}

class Teacher
{
    String name;
    String subject;

    void show(Scanner sc)
    {
        System.out.println("Enter the name of the teacher:");
        name = sc.nextLine();

        System.out.println("Enter the subject taught by the teacher:");
        subject = sc.nextLine();
    }

    void display()
    {
        System.out.println("Name of the teacher: " + name);
        System.out.println("Subject taught by the teacher: " + subject);
    }
}

public class question26
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        Teacher t = new Teacher();

        s.show(sc);
        s.display();

        t.show(sc);
        t.display();

        sc.close();
    }
}