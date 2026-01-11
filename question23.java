public class question23 {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i;j++)
            {
                if(i==1 || i==n || j==1 || j==2*i-1)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}