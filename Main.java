class Student {
    String name;
    int roll;
    double mark1, mark2, mark3, total;
    double avg, percentage;

    // Constructor
    Student(String name, int roll, double m1, double m2, double m3) {
        this.name = name;
        this.roll = roll;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;

        total = mark1 + mark2 + mark3;
        avg = total / 3;
        percentage = (total / 300) * 100;   // assuming each subject is out of 100
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("------------------------");
    }
}

// Subclass MSc
class MSc extends Student {

    MSc(String name, int roll, double m1, double m2, double m3) {
        super(name, roll, m1, m2, m3);
    }
}

// Subclass MCA
class MCA extends Student {

    MCA(String name, int roll, double m1, double m2, double m3) {
        super(name, roll, m1, m2, m3);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        MSc s1 = new MSc("Rahul", 101, 85, 90, 88);
        MCA s2 = new MCA("Anita", 102, 78, 82, 80);

        s1.display();
        s2.display();
    }
}