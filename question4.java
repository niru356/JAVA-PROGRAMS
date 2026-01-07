
import java.io.*;
public class question4{
    public static void main(String args[])throws IOException{
        int n,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Terms =");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
