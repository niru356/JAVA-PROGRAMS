import java.io.*;
public class greater_three {
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the Number =");
        b=Integer.parseInt(br.readLine());
        System.out.println("Enter the Number =");
        c=Integer.parseInt(br.readLine());
        if(a>b && a>c)
        {
            System.out.println(a+"is Greater");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+"is Greater");
        }
        else
        {
            System.out.println(c+"is Greater");
        }
    }
}
