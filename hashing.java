import java.util.HashSet;
public class hashing 
{
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("HashSet: "+set);
        System.out.println("Contains 3: "+set.contains(3));
        set.remove(3);
        System.out.println("HashSet after removing 3: "+set);
    }
}
