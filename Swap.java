import java.util.*;
public class Swap
{
public static void main(String args[])
{
int x,y,a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number =");
x=sc.nextInt();
System.out.println("Enter the Number =");
y=sc.nextInt();
System.out.println("Enter the Number =");
a=sc.nextInt();
System.out.println("Enter the Number =");
b=sc.nextInt();
x=x+y;
y=x-y;
x=x-y;
a=a^b;
b=a^b;
a=a^b;
System.out.println("Value of x ="+x);
System.out.println("Value of y ="+y);
System.out.println("Value of x after XOR ="+a);
System.out.println("Value of y after XOR ="+b);
}
}