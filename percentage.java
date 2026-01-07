import java.io.*;

public class percentage {
    public static void main(String args[])throws IOException
    {
        int mark1,mark2,mark3,mark4,mark5,total;
        float percentage;
        char grade;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First Subject Marks =");
        mark1=Integer.parseInt(br.readLine());
        System.out.println("Enter the Second Subject Marks =");
        mark2=Integer.parseInt(br.readLine());
        System.out.println("Enter the Third Subject Marks =");
        mark3=Integer.parseInt(br.readLine());
        System.out.println("Enter the Fourth Subject Marks =");
        mark4=Integer.parseInt(br.readLine());
        System.out.println("Enter the Fifth Subject Marks =");
        mark5=Integer.parseInt(br.readLine());
        total=mark1+mark2+mark3+mark4+mark5;
        percentage = (total / 500.0f) * 100;
        System.out.println("Total Marks ="+total);
        System.out.println("Percentage ="+percentage);
        if(percentage>=90)
        {
            grade='A';
            System.out.println("Grade is ="+grade);
        }
        if(percentage>=80 && percentage<90)
        {
            grade='B';
            System.out.println("Grade is ="+grade);
        }
        if(percentage>=70 && percentage<80)
        {
            grade='C';
            System.out.println("Grade is ="+grade);
        }
        if(percentage>=60 && percentage<70)
        {
            grade='D';
            System.out.println("Grade is ="+grade);
        }
        if(percentage>=40 && percentage<60)
        {
            grade='E';
            System.out.println("Grade is ="+grade);
        }
        if(percentage<40)
        {
            grade='F';
            System.out.println("Grade is ="+grade);
        }
    }
}
