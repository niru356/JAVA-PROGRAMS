import java.util.*;
public class even
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number =");
		num=sc.nextInt();
		if((num^1)==num+1)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}