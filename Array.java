import java.util.*;

class Array
{
    int arr[];
    int size;

    Array(int size)
    {
        this.size = size; 
        arr = new int[size];
    }

    void inputElements()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the Array =");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    void display()
    {
        System.out.println("Array Elements are =");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
	void Sum()
	{
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		double avg=sum/size;
		System.out.println("Sum of the Elements ="+sum);
		System.out.println("Average of the Elements ="+avg);
	}
	void max()
	{
		int temp;
		int max=arr[0],min=arr[0],maxindex=0,minindex=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				maxindex=i;
				
			}
			if(arr[i]<min)
			{
				min=arr[i];
				minindex=i;
			}
			
		}
			System.out.println("Maxindex="+maxindex);
			System.out.println("Minindex="+minindex);
			temp=arr[maxindex];
			arr[maxindex]=arr[minindex];
			arr[minindex]=temp;
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array =");
        int n = sc.nextInt();

        Array obj = new Array(n);

        obj.inputElements();
        obj.display();
		obj.Sum();
		obj.max();
    }
}
