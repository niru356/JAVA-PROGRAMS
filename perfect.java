import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class perfect {
    public static void main(String args[])throws IOException
    {
        int n,sum=0,i,temp;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number =");
        n=Integer.parseInt(br.readLine());
        temp=n;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(temp==sum)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect number");
        }
    }
}
