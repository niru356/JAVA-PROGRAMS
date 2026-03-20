import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
int num,temp,d,sum=0,count=0,temp1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number =");
num=sc.nextInt();
temp=num;
while(temp>0)
{
temp=temp/10;
count++;
}
temp1=num;
while(num>0)
{
d=num%10;
sum=sum+(int)(Math.pow(d,count));
num=num/10;
}
if(temp1==sum)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not Armstrong Number");
}
}
}

