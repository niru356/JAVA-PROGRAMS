import java.io.*;
public class Even {
    public static void main(String args[])throws IOException
    {
        int x;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number =");
        x=Integer.parseInt(br.readLine());
        if(x%2==0)
        {
            System.out.println(x+" is an Even Number");
        }
        else
        {
            System.out.println(x+" is an Odd Number");
        }   
    }
}
