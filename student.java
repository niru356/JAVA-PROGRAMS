import java.util.*;
class student
{
    int Roll_no,mark1,mark2,mark3;
    String name;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roll no =");
        Roll_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name of student =");
        name=sc.nextLine();
        System.out.println("Enter the Mark 1=");
        mark1=sc.nextInt();
        System.out.println("Enter the Mark 2=");
        mark2=sc.nextInt();
        System.out.println("Enter the Mark 3=");
        mark3=sc.nextInt();
    }  
    void calculate()
    {
        int total=mark1+mark2+mark3;
        float per=total/3;
        System.out.println("Total marks of the student ="+total);
        System.out.println("Percentage secured ="+per);        
    }
    void display()
    {
        System.out.println("Name of the Studnet ="+name);
        System.out.println("Roll no of the Student ="+Roll_no);
    }
    public static void main(String args[])
    {
        student obj=new student();
        obj.input();
        obj.display();
        obj.calculate();
    }
}