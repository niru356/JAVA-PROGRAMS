import java.util.*;
public class digit
{
public static void main(String args[])
{
int num,d,sum=0,count=0,d1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number =");
num=sc.nextInt();
while(num>0)
{
d=num%10;
sum=sum+d;
num=num/10;
}
System.out.println("Sum of Digit ="+sum);
while(sum>0)
{
	d1=sum%10;
	count+=1;
	sum=sum/10;
}
System.out.println("Count the Number of Digits ="+count);
}
}
