import java.util.*;


public class union
{
    public static void main(String args[])
    {
        int arr1[] = {1, 2, 2, 3, 4};
        int arr2[] = {2, 3, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        // Add first array elements
        for(int i = 0; i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }

        // Add second array elements
        for(int i = 0; i < arr2.length; i++)
        {
            set.add(arr2[i]);
        }

        System.out.println("Union of arrays:");

        for(int num : set)
        {
            System.out.print(num + " ");
        }
    }
}