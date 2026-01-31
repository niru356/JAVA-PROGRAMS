import java.io.*;
public class question16
{
    public static void main(String[] args)throws IOException
    {
        int num1,num2,i,hcf = 0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num1=Integer.parseInt(br.readLine());
        System.err.println("Enter the Number =");
        num2=Integer.parseInt(br.readLine());
        for(i=1;i<=num1 && i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        System.err.println("HCF of the Number ="+hcf);
    }
}