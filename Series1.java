import java.util.*;
public class Series1
{
public static void main(String args[])
{
	int n;
	double i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Nth Term =");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		System.out.print("1/"+i+" ");
		sum=sum+1.0/i;
	}
	System.out.println("Sum of the Numbers ="+sum);
}
}
