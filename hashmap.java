import java.util.HashMap;
public class hashmap
{
    public static void main(String args[])
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        System.out.println("Value for key 'apple': " + map.get("apple"));
        System.out.println("Value for key 'banana': " + map.get("banana"));
        System.out.println("Value for key 'orange': " + map.get("orange"));
        if(map.containsKey("grape"))
        {
            System.out.println("Value for key 'grape': " + map.get("grape"));
        }
        else
        {
            System.out.println("Key 'grape' not found");
        }
    }
}