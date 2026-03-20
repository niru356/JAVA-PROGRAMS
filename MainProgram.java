import java.util.Scanner;
import mathop.MathsOperations;
public class MainProgram
{
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Numbers of Elements =");
	int arr[]=new int[n];
	System.out.println("Enter the Numbers =");
	for(i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int max=MathsOperations.findmax(arr);
	int min=MathsOperations.findmin(arr);
	System.out.println("Max Element in the Array ="+max);
	System.out.println("Min Element in the Array ="+min);
	sc.close()
}
	
	
