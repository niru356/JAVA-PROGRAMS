class Student
{
    String name;
    int age;
    static String college="KIIT";
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("College = " + college);
    }
    public static void main(String[] args)
    {
        Student s1=new Student("Nirakar",24);
        Student s2=new Student("Satyarth",22);
        System.out.println("Details of Student 1:");
        s1.display();
        System.out.println("Details of Student 2:");
        s2.display();
    }
}
