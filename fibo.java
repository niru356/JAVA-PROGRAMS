public class fibo {
    public static void main(String[] args) {
        int a=0,b=1,c=0,n;
        n=10;
        for(int i=0;i<=n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(a+" ");
        }
    }
}
