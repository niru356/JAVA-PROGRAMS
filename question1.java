import java.io.*;
class question1
{
    public static void main(String[] args)throws IOException
    {
       int n,i; 
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Nuumber of Terms =");
       n=Integer.parseInt(br.readLine());
       for(i=1;i<=n;i++)
       {
            System.out.print(i + " ");
       }
    }
}