import java.util.*;

class Employee {
    int Emp_ID;
    String name;
    double Basic_salary, TA, DA, HRA, PF;
    double Gross_Salary, Net_Salary;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        Emp_ID = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        Basic_salary = sc.nextDouble();
    }

    void calculate() {
        DA = 0.65 * Basic_salary;   // 65%
        HRA = 0.15 * Basic_salary;  // 15%
        TA = 0.24 * Basic_salary;   // 24%
        PF = 0.21 * Basic_salary;   // 21%

        Gross_Salary = Basic_salary + TA + HRA + DA;
        Net_Salary = Gross_Salary - PF;
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + Emp_ID);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + Basic_salary);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("TA: " + TA);
        System.out.println("PF: " + PF);
        System.out.println("Gross Salary: " + Gross_Salary);
        System.out.println("Net Salary: " + Net_Salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.input();
        emp.calculate();
        emp.display();
    }
}