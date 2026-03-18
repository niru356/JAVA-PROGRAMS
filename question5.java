class Employee
{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        System.out.println("Salary :"+salary);
    }
    public static void main(String args[])
    {
        Employee e1=new Employee("John",101,50000);
        Employee e2=new Employee("Niru",102,60000);
        Employee e3=new Employee("Aditi",103,70000);
        e1.display();
        e2.display();
        e3.display();
    }
}