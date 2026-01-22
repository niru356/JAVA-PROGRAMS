
import java.io.*;
public class question8 {
    public static void main(String args[])throws IOException
    {
        int num,power,num2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Emter the Number =");
        num=Integer.parseInt(br.readLine());
        System.err.println("Enter the Power =");
        num2=Integer.parseInt(br.readLine());
        power=(int)(Math.pow(num, num2));
        System.err.println(power+" ");
    }
}
