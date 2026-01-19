public class question6 {
    public static void main(String args[])
    {
        int a=0,b=1,c=0,n=10,i,sum=0;
        for(i=0;i<=n;i++)
        {
            c=a+b;
            sum=sum+c;
            a=b;
            b=c;
        }
        System.out.print(sum+" ");
    }
}
