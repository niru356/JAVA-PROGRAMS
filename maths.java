import java.io.*;
public class maths {
    public static void main(String args[])throws IOException
    {
        int x,y;
        float result;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number :");
        x=Integer.parseInt(br.readLine());
        System.out.println("Enter the Number :");
        y=Integer.parseInt(br.readLine());
        result=(x*y)/(x+y);
        System.out.println("Result is :"+result);
    }
}
