public class question31 
{
    public static void main(String args[])
    {
        int i, n = 500, temp, d, sum;

        for (i = 1; i <= n; i++)
        {
            temp = i;
            sum = 0;   // reset sum for each number

            while (temp != 0)
            {
                d = temp % 10;
                sum = sum + (d * d * d);
                temp = temp / 10;
            }

            if (sum == i)
            {
                System.out.println(i);
            }
        }
    }
}
