
import java.io.*;
public class prime2 {
    public static void main(String[] args)throws IOException
    {
        int num,i,flag=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Number of Terms =");
        num=Integer.parseInt(br.readLine());
        for(i=2;i<=num;i++)
        {
            flag=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(i+" is a Prime Number");
            }
        }
    }
}