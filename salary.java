import java.io.*;

public class salary {
    public static void main(String args[])throws IOException
    {
        int basic_salary;
        float hra=1,da=1,gross_salary;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Basic salary =");
        basic_salary=Integer.parseInt(br.readLine());
        if(basic_salary<=10000)
        {
            hra=0.20f*basic_salary;
            da=0.80f*basic_salary;
        }
        else if(basic_salary<=20000)
        {
            hra=0.25f*basic_salary;
            da=0.90f*basic_salary;
        }
        else if(basic_salary>20000)
        {
            hra=0.30f*basic_salary;
            da=0.95f*basic_salary;
        }
        gross_salary=basic_salary+hra+da;
        System.out.println("Gross Salary ="+gross_salary);
    }
}
