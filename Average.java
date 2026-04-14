import java.util.*;
public class Average {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        double avg;
        System.out.println("Enter the Elements of the Array =");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sum=sum+arr[i][j];
            }
        }
        avg=(double)sum/9;
        System.err.println("The Average of the Elements of the Array is ="+avg);
    }
}
