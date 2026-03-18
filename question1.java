class Student {

    // Instance variables
    String name;
    int age;
    
    // Default Constructor
    Student() {
        name = "Nirakar";
        age = 30;
    }
    // Method to display student details
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    // Main method (program starts here)
    public static void main(String args[]) {

        // Creating object of Student class
        Student s1 = new Student();

        // Calling display method
        s1.display();
    }
}