class employee
{
    int id;
    String name;
    String department;
    double salary;

    // Create a constructor paraameterized constructor
    public employee(int id,String name,String department,double salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    // Create a method to display the employee details
    public void display()
    {
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Department: "+department);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String[] args)
    {
        employee emp1=new employee(120,"Nirakar","Doctor",750000);
        emp1.display();
    }
}