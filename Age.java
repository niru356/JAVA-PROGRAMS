import java.io.*;

public class Age {
    public static void main(String args[])throws IOException
    {
        int age;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Age =");
        age=Integer.parseInt(br.readLine());
        if(age>=18)
        {
            System.out.println("You are Eligible to Vote");
        }
        else
        {
            System.out.println("You are Not Eligible to Vote");
        }
    }
}
