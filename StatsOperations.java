package statop;
import java.util.Arrays;
public class StatsOperations
{
	public static double findAverage(int arr[])
	{
		int sum=0,i;
		double avg;
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		return avg;
	}
	public static double findmedian(int arr[])
	{
		Arrays.sort(arr);
		int n=arr.length;
		if(n%2==0)
		{
			return (arr[n/2]+arr[(n/2)-1]);
		}
		else
		{
			return(arr[n/2]);
		}
	}
}