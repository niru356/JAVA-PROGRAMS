import  java.util.HashMap;
public class highfrequency
{
    // To find the most frquent element in the array
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i])) 
            {
                map.put(arr[i],map.get(arr[i])+1); // 
            }
            else
            {
                map.put(arr[i],1); //
            }
        }
        int max = Integer.MIN_VALUE;
        int element = 0;
        for(Integer key:map.keySet())
        {
            if(map.get(key)>max) //
            {
                max = map.get(key); 
                element = key;
            }
        }
        System.out.println("The most frequent element is: "+element);
    }   
}
