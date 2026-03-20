import java.util.*;
public class greater
{
public static void main(String args[])
{
int x,y,greater,smaller;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number =");
x=sc.nextInt();
System.out.println("Enter the Number =");
y=sc.nextInt();
greater=(x>y)? x:y;
smaller=y;
System.out.println("Greatest of two Numbers ="+greater);
System.out.println("Smaller of Two Numbers ="+smaller);
}
}