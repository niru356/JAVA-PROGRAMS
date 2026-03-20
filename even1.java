import java.util.*;
public class even1
{
public static void main(String args[])
{
	int arr[]=new int[5];
	int even=0,odd=0,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Elements of the Array =");
	for(i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			even=even+1;
		}
		else
		{
			odd=odd+1;
		}
	}
	System.out.println("Number of even Numbers ="+even);
	System.out.println("Number of odd Numbers ="+odd);
}
}
	
	
	
	
		
	
	
