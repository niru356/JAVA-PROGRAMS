import java.util.*;
class vechile
{
	private String Brand;
	private country_of_origin;
	private double Base_price;
	
	// INPUT THE DETAILS OF VECHILE
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Brand of the Vechile =");
		Brand=sc.nextLine();
		System.out.println("Enter the Country of Origin =");
		country_of_origin=sc.nextLine();
		System.out.println("Enter the Base Price of the Vechile =");
		Base_price=sc.nextDouble();
	}
	// DISPLAY THE DETAILS
	public void display()
	{
		System.out.println("Brand of the Vechile ="+Brand);
		System.out.pritnln("Country of the Origin ="+country_of_origin);
		System.out.println("Base Price of the Vechile ="+Base_price);
	}
	
	public double getBasePrice()
	{
		return Base_price;
	}
}
	
	// CREATING A SUBCLASS
	class car extends vechile
	{
		private String Model;
		private double speed;
		private double Market_price;
		
		public void read()
		{
			Scanner sc=new Scanner(System.in);
			input();
			System.out.println("Enter the Model of the Car =");
			Model=sc.nextLine();
			System.out.println("Enter the Speed of the Car =");
			speed=sc.nextDouble();
			System.out.println("Enter the Market price of the car =");
			Market_price=sc.nextDouble();
		}
		public void calculate()
		{
			if(speed>=80)
			{
				Market_price=base+(0.15*base);
			}
			else
			{
				Market_price=base-(0.5*base);
			}
		}
		
		// DISPLAY IN SUB-CLASS
		public void show()
		{
			System.out.println("Model of the Car ="+Model);
			System.out.println("Speed of the Car ="+speed);
			System.out.println("Market Price of the Car ="+Market_price);
		}
	}
		public class Main()
		{
			public static void main(String args[])
			{
				car c=new car();
				c.read();
				System.out.println("Car Details =");
				c.show();
			}
		}
	

	
			
	