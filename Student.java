import java.util.*;
class Student
{
    String name;
    int roll_no,m1,m2,m3;
    String course;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of Student =");
        name=sc.nextLine();
        System.out.println("Enter the Roll no of Student =");
        roll_no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Course of Student =");
        course=sc.nextLine();
        System.out.println("Enter the Marks of 3 subjects =");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    void display()
    {
        System.out.println("Name of Student ="+name);
        System.out.println("Roll no of Student ="+roll_no);
        System.out.println("Course of Student ="+course);
    }
    int marks()
    {
        return m1+m2+m3;
    }
}

class Result extends Student
{
    String grade;
    double percentage;
    void read()
    {
        input();
        percentage=(marks()/300.0)*100;
        if(percentage>=90)
            grade="A";
        else if(percentage>=80)
            grade="B";
        else if(percentage>=70)
            grade="C";
        else if(percentage>=60)
            grade="D";
        else
            grade="F";
    }
    void show()
    {
        display();
        System.out.println("Total Marks ="+marks());
        System.out.println("Percentage ="+percentage);
        System.out.println("Grade ="+grade);
    }
}
public static void  main(String[] args)
    {
        Result r=new Result();
        r.read();
        r.show();
    }   
}