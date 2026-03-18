import java.util.*;
class Number
{
    int num;
    Number(int num)
    {
        this.num=num;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number =");
        num=sc.nextInt();
    }
    void display()
    {
        if(num%2==0)
        {
            System.out.println(num+" is Even Number");
        }
        else
        {
            System.out.println(num+" is Odd Number");
        }
    }
    public static void main(String[] args) {
        Number n=new Number(0);
        n.input();
        n.display();
    }
}