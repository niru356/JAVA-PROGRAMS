import java.util.Scanner;
import mathop.MathsOperation;
import statop.StatsOperations;
public class MainProgram
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers of Elements =");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Numbers =");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=MathsOperation.findmax(arr);
		int min=MathsOperation.findmin(arr);
		double avg=StatsOperations.findAverage(arr);
		double median=StatsOperations.findmedian(arr);
		System.out.println("Max Element in the Array ="+max);
		System.out.println("Min Element in the Array ="+min);
		System.out.println("Average Element in the Array ="+avg);
		System.out.println("Mdeian Element in the Array ="+median);
		sc.close();
	}
}
	
