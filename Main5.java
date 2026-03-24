abstract class Fruit
{
	String color;
	String Taste;
	
	// Abstract method
	abstract void display();
}

// class Apple
class Apple extends Fruit
{
	Apple()
	{
		color="Red";
		Taste="Sweet";
	}
	void display()
	{
		System.out.println("Apple Color:"+color+" "+"Taste :"+Taste);
	}
}

// Class Banana
class Banana extends Fruit
{
	Banana()
	{
		color="Yellow";
		Taste="Sweet";
	}
	void display()
	{
		System.out.println("Banana Color:"+color+" "+"Taste :"+Taste);
		
	}
}

// Class Orange
class Orange extends Fruit
{
	Orange()
	{
		color="Orange";
		Taste="Sweet";
	}
	void display()
	{
		System.out.println("Orange Color:"+color+" "+"Taste :"+Taste);
		
	}
}

// Class Strawberry
class Strawberry extends Fruit
{
	Strawberry()
	{
		color="Pink";
		Taste="Sweet";
	}
	void display()
	{
		System.out.println("Strawberry Color:"+color+" "+"Taste :"+Taste);
		
	}
}

// Main class 
public class Main5
{
	public static void main(String args[])
	{
		Fruit f;
		
		//Apple 
		f=new Apple();
		f.display();
		
		// Banana 
		f=new Banana();
		f.display();
		
		// Orange 
		f=new Orange();
		f.display();
		
		//Strawberry
		f=new Strawberry();
		f.display();
	}
}
		