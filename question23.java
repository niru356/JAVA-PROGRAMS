import java.util.*;
class Outer1
{
    void display()
    {
        class Inner1
        {
            void show()
            {
                System.out.println("My name is Nirakar Rath");
                System.out.println("I am a student of KIIT University");
                System.out.println("I am in 3rd year of my B.Tech course");
            }
        }
        Inner1 o=new Inner1();
        o.show();
    }
    public static void main(String[] args)
    {
        Outer1 o=new Outer1();
        o.display();
    }
}