import java.io.*;
public class count {
    public static void main(String args[])throws IOException
    {
        int num,i,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        num=Integer.parseInt(br.readLine());
        while(num!=0)
        {
            num=num/10;
            count=count+1;
        }
        System.out.println("Number of Digits ="+count);
    }
}