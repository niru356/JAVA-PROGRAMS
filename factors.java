import java.io.*;
public class factors {
    public static void main(String[] args)throws IOException 
    {
        int  num,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Factors of the Number ="+i);
            }
        }
    }
}
