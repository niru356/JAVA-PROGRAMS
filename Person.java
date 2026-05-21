public class Person
{
    void display()
    {
        System.out.println("Welcome");
    }
}
class students extends Person
{
    void display()
    {
        System.out.println("My name is Nirakar Rath");
        System.out.println("My age is 28");
        System.out.println("My city is Pune");
    }
}
class Teacher extends Person
{
    void display()
    {
        System.out.println("My name is Satyarth Rath");
        System.out.println("My age is 30");
        System.out.println("My city is Pune");
    }
}
class Test
{
    public static  void main(String args[])
    {
        Person p=new Person();
        Person s=new students();
        Person t=new Teacher();
        p.display();
        s.display();
        t.display();
    }
}
