import java.util.*;
class A2
{
    int a,b,c;
    static {
        System.out.println("Static block is executed");
    }
    void input(int x,int y)
    {
        a=x;
        b=y;
    }
    void sum()
    {
        c=a+b;
        System.out.println("The sum is: "+c);
    }
    void display()
    {
        System.out.println("The value of a is: "+a);
        System.out.println("The value of b is: "+b);
    }
    public static void main(String[] args) {
        A2 obj=new A2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        obj.a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        obj.b=sc.nextInt();
        obj.sum();
        obj.display();
        sc.close();
    }
}