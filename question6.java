public class question6 {
    public static void main(String args[])
    {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-
                i;j++)
            {
                System.err.print(" ");
            }
            for(j=1;j<=n;j++)
            {
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
