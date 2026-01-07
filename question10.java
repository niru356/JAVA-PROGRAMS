import java.io.*;
public class question10 {
    public static void main(String[] args)throws IOException
    {
        int num,num2,temp, sum=0,rem;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        System.out.println("Enter the Number =");
        num2=Integer.parseInt(br.readLine());
        temp=num;
        num=num2;
        num2=temp;
        System.out.println("After Swapping First Number =" +num);
        System.out.println("After Swapping Second Number =" +num2);
    }
}
