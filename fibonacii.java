import java.util.*;
public class fibonacii
{
public static void main(String args[])
{
int n,a=0,b=1,c,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number =");
n=sc.nextInt();
for(i=0;i<=n;i++)
{
c=a+b;
a=b;
b=c;
System.out.print(a+" ");
}
}
}