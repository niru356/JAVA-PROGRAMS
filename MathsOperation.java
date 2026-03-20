package mathop;
public class MathsOperation
{
	public static int findmax(int arr[])// METHOD TO FIND MAX
	{
		int max=arr[0],i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int findmin(int arr[])//METHOD TO FIND MIN
	{
		int min=arr[0],i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
}

