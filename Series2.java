import java.util.*;
public class Series2
{
public static void main(String args[])
{
double sum=0;
int n,x,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Nth Term =");
n=sc.nextInt();
System.out.println("Enter the Value of X=");
x=sc.nextInt();
for(i=1;i<=n;i++)
{
sum=sum+1+1.0/Math.pow(x,i);
}
System.out.println("Sum of the Series ="+sum);
}
}

