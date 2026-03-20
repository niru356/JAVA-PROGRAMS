import java.util.*;
public class bit
{
public static void main(String args[])
{
int n,num,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number =");
num=sc.nextInt();
System.out.println("Enter the Nth Bits =");
n=sc.nextInt();
y=num>>n;
System.out.println("Number is corresponding Bit ="+y);
}
}

