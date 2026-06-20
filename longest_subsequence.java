import java.util.*;
public class longest_subsequence
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int max = 1;
        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i]-1)) // 
            {
                int count = 1;
                while(set.contains(arr[i]+count)) // 
                {
                    count++;
                }
                max = Math.max(max,count); // 
            }
        }
        System.out.println("The length of the longest subsequence is: "+max);
    }
}