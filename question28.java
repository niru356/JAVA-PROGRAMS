public class question28 {
    public static void main(String args[])
    {
        int i,j,N=5;
        for(i=1;i<=N;i++)
        {
            for(j=1;j<=N-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=N;j++)
            {
                if(i==1 || i==N || j==1 || j==N)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
