public class question25 {
    public static void main(String[] args) 
    {
        int i,j,N=5;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(N);
            }
            System.err.println();
            N=N-1;
        }
    }
}
