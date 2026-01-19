public class question5 {
    public static void main(String args[])
    {
        int a=0,b=1,c=0,n=10,i;
        for(i=0;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(a+" ");
        }
    }
}
