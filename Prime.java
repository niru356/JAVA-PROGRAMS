class Prime
{
public static void main (String args[])
{
scanner S = new scanner.nextInt();
int a = S nextInt();

if(a%2==8)
System.out.println ("The number is given even");
{
else
System.out.println ("The number is given odd");
}
}
}



class Gross_Salary
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Basic Salary :");
		int bs = input.nextInt();
		float hra,da,tot;
		if(bs<=10000)
		{			
			hra = bs*0.2f;
			da = bs*0.8f;
		}
		else if(bs<=20000)
		{
			hra = bs*0.25f;
			da = bs*0.9f;
		}
		else
		{
			hra = bs*0.3f;
			da = bs*0.95f;
		}
		System.out.println("Gross Salary : "+(bs+hra+da));
	}
}