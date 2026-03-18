class Students
{
    String name;
    int age;
    String Course;

    Students()
    {
        name = "Nirakar Rath";
        age = 22;
        Course = "MCA";
    }

    // DISPLAY THE DETAILS
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + Course);
    }

    public static void main(String args[])
    {
        Students s1 = new Students();
        s1.display();
    }
}