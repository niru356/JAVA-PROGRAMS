import java.util.*;
class Out
{
    String name;
    int age;
    class In
    {
        void details()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter name: ");
            name=sc.nextLine();
            System.out.print("Enter age: ");
            age=sc.nextInt();
        }
        void display()
        {
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
    }
    public static void main(String[] args)
    {
        Out o=new Out();
        Out.In i=o.new In();
        i.details();
        i.display();
    }
}