import java.util.Scanner;
class PrimeFactor
{
public static void main(String args[])
{
int n,temp=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
System.out.println("The prime factors are:");
for(i=2;i*i<=n;i++)
{
while(n%i==0)
{
if(temp!=i)
    System.out.println(i);
n=n/i;
temp=i;
}
}
if(n>1 && temp!=n) 
    System.out.println(n);
}
}