import java.util.*;

public class selection
{
    public static void main(String args[])
    {
        int n, temp;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements in the Array =:");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Elements of the Array =:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorting the Array using Selection Sort =:");

        for(int i = 0; i < n - 1; i++)
        {
            int min = i;

            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("The Sorted Array is =:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}