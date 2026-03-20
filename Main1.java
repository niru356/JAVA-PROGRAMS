import java.util.*;
class Person
{
	String name;
	int id;
	int year_of_join;
	
	// INPUT THE DETAILS OF THE PERSONS
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the Persons =");
		name=sc.nextLine();
		System.out.println("Enter the id of the 
