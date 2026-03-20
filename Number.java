import java.util.*;
class Number
{
	int arr[];   
	int n;
	
	//constructor
	Number(int n)
	{
		this.n=n;
		arr=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements of the Array =");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println("Elements of the Array =");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	class Oddnum extends Number
	{
		int oddarr[];
		int count=0;
		
		// Constructor 
		Oddnum(int n)
		{
			super(n);
			
			// Count the Odd Numbers
			for(int i=0;i<n;i++)
			{
				if(arr[i]%2!=0)
				{
					count=count+1;
				}
			}
			oddarr=new int[count];
		}
		
		// copy Odd numbers
		void copyodd()
		{
			int j=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]%2!=0)
				{
					oddarr[j++]=arr[i];
				}
			}
		}
		void displayodd()
		{
			System.out.println("Odd Numbers are =");
			for(int i=0;i<count;i++)
			{
				System.out.print(oddarr[i]+" ");
			}
			System.out.println();
		}
	}
	class Main
	{
		public static void main(String args[])
		{
			Number obj=new Number(5);
			obj.display();
			obj.copyodd();
			obj.displayodd();
		}
	}
}
		
		
					
		
			
	