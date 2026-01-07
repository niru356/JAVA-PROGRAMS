import java.io.*;
public class maths1 {
    public static void main(String[] args)throws IOException
    {
        int n,base,exponent;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Base =");
        base=Integer.parseInt(br.readLine());
        System.out.println("Enter the Exponent =");
        exponent=Integer.parseInt(br.readLine());
        double result=Math.pow(base,exponent);
        System.out.println(base+" raise to the power "+exponent+" = "+result);
    }
}
