import java.io.*;
public class greater {
    public static void main(String args[])throws IOException
    {
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number =");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter Second Number ="); 
        b=Integer.parseInt(br.readLine());
        if(a>b)
        {
            System.out.println(a + "is Greater Number");
        }
        else if(b>a)
        {
            System.out.println(b + "is Greater Number");
        }
        else
        {
            System.out.println("Both Number are Equal");
        }
    }
}
