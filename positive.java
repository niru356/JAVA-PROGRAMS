import java.io.*;

public class positive {
    public static void main(String args[])throws IOException
    {
        int num;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        if(num>0)
        {
            System.out.println(num + "is Positive");
        }
        else if(num<0)
        {
            System.out.println(num + "is Negeative");
        }
        else
        {
            System.out.println(num + "is Zero");
        }

    }
}
