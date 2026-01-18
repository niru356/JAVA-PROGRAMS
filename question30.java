public class question30 {
    public static void main(String args[])
    {
        int age=24,d1,next_age,d2,prev_age;
        String name="Nirakar";
        d1=age%10;
        d2=age/10;
        next_age=age+d1;
        prev_age=age-d2;
        System.out.println("Name ="+name);
        System.out.println("Next age ="+next_age);
        System.out.println("Previous Age="+prev_age);
    }
}
